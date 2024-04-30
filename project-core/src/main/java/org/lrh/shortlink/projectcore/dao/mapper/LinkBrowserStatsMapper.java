package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.lrh.shortlink.projectcore.dao.entity.LinkBrowserStatsDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dto.req
 * @ClassName: LinkBrowserStatsMapper
 * @Author: 63283
 * @Description: 浏览器统计访问持久层
 * @Date: 2024/4/30 下午8:30
 */

public interface LinkBrowserStatsMapper extends BaseMapper<LinkBrowserStatsDO> {
    /**
     * 记录浏览器访问监控数据
     * @param linkBrowserStatsDO 浏览器统计访问实体
     */
    @Insert("INSERT INTO " +
            "t_link_browser_stats (full_short_url,gid ,date, cnt, browser, create_time, update_time, del_flag) " +
            "VALUES( #{linkBrowserStats.fullShortUrl},#{linkBrowserStats.gid}, #{linkBrowserStats.date}, #{linkBrowserStats.cnt}, #{linkBrowserStats.browser}, NOW(), NOW(), 0) " +
            "ON DUPLICATE KEY UPDATE cnt = cnt +  #{linkBrowserStats.cnt};")
    void shortLinkBrowserState(@Param("linkBrowserStats") LinkBrowserStatsDO linkBrowserStatsDO);

}
