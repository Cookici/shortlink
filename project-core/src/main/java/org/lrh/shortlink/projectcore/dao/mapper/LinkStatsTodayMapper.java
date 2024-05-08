package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.lrh.shortlink.projectcore.dao.entity.LinkStatsTodayDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: LinkStatsTodayMapper
 * @Author: 63283
 * @Description: 短链接今日统计持久层
 * @Date: 2024/5/8 下午8:08
 */

public interface LinkStatsTodayMapper extends BaseMapper<LinkStatsTodayDO> {

    /**
     * 记录今日统计监控数据
     * @param linkStatsTodayDO linkStatsTodayDO
     */
    @Insert("INSERT INTO " +
            "t_link_stats_today (full_short_url, date,  today_uv, today_pv, today_uip, create_time, update_time, del_flag) " +
            "VALUES( #{linkTodayStats.fullShortUrl}, #{linkTodayStats.date}, #{linkTodayStats.todayUv}, #{linkTodayStats.todayPv}, #{linkTodayStats.todayUip}, NOW(), NOW(), 0) " +
            "ON DUPLICATE KEY UPDATE today_uv = today_uv +  #{linkTodayStats.todayUv}, today_pv = today_pv +  #{linkTodayStats.todayPv}, today_uip = today_uip +  #{linkTodayStats.todayUip};")
    void shortLinkTodayState(@Param("linkTodayStats") LinkStatsTodayDO linkStatsTodayDO);
}
