package org.lrh.shortlink.projectcore.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.lrh.shortlink.projectcore.common.database.BaseDO;

import java.util.Date;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.dao.entity
 * @ClassName: LinkDeviceStatsDO
 * @Author: 63283
 * @Description: 访问设备统计访问实体
 * @Date: 2024/4/30 下午8:44
 */
@Data
@TableName("t_link_device_stats")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkDeviceStatsDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * gid
     */
    private String gid;

    /**
     * 日期
     */
    private Date date;

    /**
     * 访问量
     */
    private Integer cnt;

    /**
     * 访问设备
     */
    private String device;
}

