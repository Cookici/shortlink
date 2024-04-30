package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.lrh.shortlink.projectcore.dao.entity.LinkNetworkStatsDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: LinkNetworkStatsMapper
 * @Author: 63283
 * @Description: 访问网络监控持久层
 * @Date: 2024/4/30 下午8:46
 */

public interface LinkNetworkStatsMapper extends BaseMapper<LinkNetworkStatsDO> {

    /**
     * 记录访问设备监控数据
     *
     * @param linkNetworkStatsDO 访问网络统计访问实体
     */
    @Insert("INSERT INTO " +
            "t_link_network_stats (full_short_url, gid,date, cnt, network, create_time, update_time, del_flag) " +
            "VALUES( #{linkNetworkStats.fullShortUrl}, #{linkNetworkStats.gid}, #{linkNetworkStats.date}, #{linkNetworkStats.cnt}, #{linkNetworkStats.network}, NOW(), NOW(), 0) " +
            "ON DUPLICATE KEY UPDATE cnt = cnt +  #{linkNetworkStats.cnt};")
    void shortLinkNetworkState(@Param("linkNetworkStats") LinkNetworkStatsDO linkNetworkStatsDO);

}