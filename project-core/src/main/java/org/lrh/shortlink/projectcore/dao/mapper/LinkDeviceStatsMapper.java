package org.lrh.shortlink.projectcore.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.lrh.shortlink.projectcore.dao.entity.LinkDeviceStatsDO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.mapper
 * @ClassName: LinkDeviceStatsMapper
 * @Author: 63283
 * @Description: 访问设备监控持久层
 * @Date: 2024/4/30 下午8:45
 */

public interface LinkDeviceStatsMapper extends BaseMapper<LinkDeviceStatsDO> {
    /**
     * 记录访问设备监控数据
     * @param linkDeviceStatsDO 访问设备统计访问实体
     */
    @Insert("INSERT INTO " +
            "t_link_device_stats (full_short_url,gid, date, cnt, device, create_time, update_time, del_flag) " +
            "VALUES( #{linkDeviceStats.fullShortUrl}, #{linkDeviceStats.gid}, #{linkDeviceStats.date}, #{linkDeviceStats.cnt}, #{linkDeviceStats.device}, NOW(), NOW(), 0) " +
            "ON DUPLICATE KEY UPDATE cnt = cnt +  #{linkDeviceStats.cnt};")
    void shortLinkDeviceState(@Param("linkDeviceStats") LinkDeviceStatsDO linkDeviceStatsDO);

}
