package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.lrh.shortlink.projectcore.dao.entity.LinkAccessStatsDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: LinkAccessStatsMapper
 * @Author: 63283
 * @Description: 短链接基础访问监控持久层
 * @Date: 2024/4/30 下午1:50
 */

public interface LinkAccessStatsMapper extends BaseMapper<LinkAccessStatsDO> {

    /**
     * 记录基础访问监控数据
     * @param linkAccessStatsDO 短链接基础访问监控实体
     */
    @Insert("INSERT INTO t_link_access_stats (full_short_url, gid,date, pv, uv, uip, hour, weekday, create_time, update_time, del_flag)" +
            "values (#{linkAccessStats.fullShortUrl},#{linkAccessStats.gid},#{linkAccessStats.date},#{linkAccessStats.pv}," +
            "#{linkAccessStats.uv},#{linkAccessStats.uip},#{linkAccessStats.hour},#{linkAccessStats.weekday},NOW(),NOW(),0)" +
            "ON DUPLICATE KEY UPDATE pv = pv +  #{linkAccessStats.pv}, uv = uv + #{linkAccessStats.uv}, uip = uip + #{linkAccessStats.uip};")
    void shortLinkStats(@Param("linkAccessStats")LinkAccessStatsDO linkAccessStatsDO);


}
