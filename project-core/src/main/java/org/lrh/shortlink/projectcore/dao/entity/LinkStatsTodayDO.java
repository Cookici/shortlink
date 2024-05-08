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
 * @ClassName: LinkStatsTodayDO
 * @Author: 63283
 * @Description: 短链接今日统计实体
 * @Date: 2024/5/8 下午8:07
 */
@TableName("t_link_stats_today")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkStatsTodayDO extends BaseDO {

    /**
     * id
     */
    private Long id;

    /**
     * 短链接
     */
    private String fullShortUrl;

    /**
     * 日期
     */
    private Date date;

    /**
     * 今日pv
     */
    private Integer todayPv;

    /**
     * 今日uv
     */
    private Integer todayUv;

    /**
     * 今日ip数
     */
    private Integer todayUip;
}