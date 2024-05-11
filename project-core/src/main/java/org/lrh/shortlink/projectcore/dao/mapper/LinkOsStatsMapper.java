package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.lrh.shortlink.projectcore.dao.entity.LinkOsStatsDO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkGroupStatsReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkStatsReqDTO;

import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: LinkOsStatsMapper
 * @Author: 63283
 * @Description: 操作系统统计访问持久层
 * @Date: 2024/4/30 下午8:18
 */

public interface LinkOsStatsMapper extends BaseMapper<LinkOsStatsDO> {

    /**
     * 记录地区访问监控数据
     * @param linkOsStatsDO 请求参数
     */
    @Insert("INSERT INTO " +
            "t_link_os_stats (full_short_url, date, cnt, os, create_time, update_time, del_flag) " +
            "VALUES( #{linkOsStats.fullShortUrl}, #{linkOsStats.date}, #{linkOsStats.cnt}, #{linkOsStats.os}, NOW(), NOW(), 0) " +
            "ON DUPLICATE KEY UPDATE cnt = cnt +  #{linkOsStats.cnt};")
    void shortLinkOsStats(@Param("linkOsStats") LinkOsStatsDO linkOsStatsDO);

    /**
     * 根据短链接获取指定日期内操作系统监控数据
     * @param requestParam 请求参数
     * @return List<HashMap<String, Object>>
     */
    @Select("SELECT " +
            "    tlos.os, " +
            "    SUM(tlos.cnt) AS count " +
            "FROM " +
            "    t_link tl INNER JOIN " +
            "    t_link_os_stats tlos ON tl.full_short_url = tlos.full_short_url " +
            "WHERE " +
            "    tlos.full_short_url = #{param.fullShortUrl} " +
            "    AND tl.gid = #{param.gid} " +
            "    AND tl.del_flag = '0' " +
            "    AND tl.enable_status = #{param.enableStatus} " +
            "    AND tlos.date BETWEEN #{param.startDate} and #{param.endDate} " +
            "GROUP BY " +
            "    tlos.full_short_url, tl.gid, tlos.os;")
    List<HashMap<String, Object>> listOsStatsByShortLink(@Param("param") ShortLinkStatsReqDTO requestParam);

    /**
     * 根据分组获取指定日期内操作系统监控数据
     */
    @Select("SELECT " +
            "    tlos.os, " +
            "    SUM(tlos.cnt) AS count " +
            "FROM " +
            "    t_link tl INNER JOIN " +
            "    t_link_os_stats tlos ON tl.full_short_url = tlos.full_short_url " +
            "WHERE " +
            "    tl.gid = #{param.gid} " +
            "    AND tl.del_flag = '0' " +
            "    AND tl.enable_status = '0' " +
            "    AND tlos.date BETWEEN #{param.startDate} and #{param.endDate} " +
            "GROUP BY " +
            "    tl.gid, tlos.os;")
    List<HashMap<String, Object>> listOsStatsByGroup(@Param("param") ShortLinkGroupStatsReqDTO requestParam);

}
