package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.lrh.shortlink.projectcore.dao.entity.LinkAccessLogsDO;
import org.lrh.shortlink.projectcore.dao.entity.LinkAccessStatsDO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkStatsReqDTO;

import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: LinkAccessLogsMapper
 * @Author: 63283
 * @Description: 访问日志监控持久层
 * @Date: 2024/4/30 下午8:49
 */

public interface LinkAccessLogsMapper extends BaseMapper<LinkAccessLogsDO> {
    /**
     * 根据短链接获取指定日期内高频访问IP数据
     * @param requestParam 请求参数
     * @return List<HashMap<String, Object>>
     */
    @Select("SELECT " +
            "    tlal.ip, " +
            "    COUNT(tlal.ip) AS count " +
            "FROM " +
            "    t_link tl INNER JOIN " +
            "    t_link_access_logs tlal ON tl.full_short_url = tlal.full_short_url " +
            "WHERE " +
            "    tlal.full_short_url = #{param.fullShortUrl} " +
            "    AND tl.gid = #{param.gid} " +
            "    AND tl.del_flag = '0' " +
            "    AND tl.enable_status = #{param.enableStatus} " +
            "    AND tlal.create_time BETWEEN #{param.startDate} and #{param.endDate} " +
            "GROUP BY " +
            "    tlal.full_short_url, tl.gid, tlal.ip " +
            "ORDER BY " +
            "    count DESC " +
            "LIMIT 5;")
    List<HashMap<String, Object>> listTopIpByShortLink(@Param("param") ShortLinkStatsReqDTO requestParam);


    /**
     * 根据短链接获取指定日期内新旧访客数据
     * @param requestParam 请求参数
     * @return HashMap<String, Object>
     */
    @Select("SELECT " +
            "    SUM(old_user) AS oldUserCnt, " +
            "    SUM(new_user) AS newUserCnt " +
            "FROM ( " +
            "    SELECT " +
            "        CASE WHEN COUNT(DISTINCT DATE(tlal.create_time)) > 1 THEN 1 ELSE 0 END AS old_user, " +
            "        CASE WHEN COUNT(DISTINCT DATE(tlal.create_time)) = 1 AND MAX(tlal.create_time) >= #{param.startDate} AND MAX(tlal.create_time) <= #{param.endDate} THEN 1 ELSE 0 END AS new_user " +
            "    FROM " +
            "        t_link tl INNER JOIN " +
            "        t_link_access_logs tlal ON tl.full_short_url = tlal.full_short_url " +
            "    WHERE " +
            "        tlal.full_short_url = #{param.fullShortUrl} " +
            "        AND tl.gid = #{param.gid} " +
            "        AND tl.enable_status = #{param.enableStatus} " +
            "        AND tl.del_flag = '0' " +
            "    GROUP BY " +
            "        tlal.user " +
            ") AS user_counts;")
    HashMap<String, Object> findUvTypeCntByShortLink(@Param("param") ShortLinkStatsReqDTO requestParam);


    /**
     * 根据短链接获取指定日期内PV、UV、UIP数据
     * @param requestParam 请求参数
     * @return LinkAccessStatsDO
     */
    @Select("SELECT " +
            "    COUNT(tlal.user) AS pv, " +
            "    COUNT(DISTINCT tlal.user) AS uv, " +
            "    COUNT(DISTINCT tlal.ip) AS uip " +
            "FROM " +
            "    t_link tl INNER JOIN " +
            "    t_link_access_logs tlal ON tl.full_short_url = tlal.full_short_url " +
            "WHERE " +
            "    tlal.full_short_url = #{param.fullShortUrl} " +
            "    AND tl.gid = #{param.gid} " +
            "    AND tl.del_flag = '0' " +
            "    AND tl.enable_status = #{param.enableStatus} " +
            "    AND tlal.create_time BETWEEN #{param.startDate} and #{param.endDate} " +
            "GROUP BY " +
            "    tlal.full_short_url, tl.gid;")
    LinkAccessStatsDO findPvUvUidStatsByShortLink(@Param("param") ShortLinkStatsReqDTO requestParam);



}
