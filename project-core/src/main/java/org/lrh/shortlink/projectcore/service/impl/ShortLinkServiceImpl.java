package org.lrh.shortlink.projectcore.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.lrh.shortlink.projectcore.common.convention.excepiton.ServiceException;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;
import org.lrh.shortlink.projectcore.dao.mapper.ShortLinkMapper;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkCreateReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkCreateRespDTO;
import org.lrh.shortlink.projectcore.service.ShortLinkService;
import org.lrh.shortlink.projectcore.toolkit.HashUtil;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service.impl
 * @ClassName: ShortLinkServiceImpl
 * @Author: 63283
 * @Description: 短链接接口实现层
 * @Date: 2024/3/24 22:13
 */
@Slf4j
@Service
public class ShortLinkServiceImpl extends ServiceImpl<ShortLinkMapper, ShortLinkDO> implements ShortLinkService {

    @Override
    public ShortLinkCreateRespDTO createShortLink(ShortLinkCreateReqDTO requestParam) {
        String shortLinkSuffix = generateSuffix(requestParam);
        ShortLinkDO shortLinkDO = BeanUtil.toBean(requestParam, ShortLinkDO.class);
        shortLinkDO.setShortUri(shortLinkSuffix);
        shortLinkDO.setFullShortUrl(requestParam.getDomain() + "/" + shortLinkSuffix);
        baseMapper.insert(shortLinkDO);
        return ShortLinkCreateRespDTO.builder()
                .fullShortUrl(shortLinkDO.getFullShortUrl())
                .originUrl(requestParam.getOriginUrl())
                .gid(requestParam.getGid())
                .build();
    }

    private String generateSuffix(ShortLinkCreateReqDTO requestParam) {
        int customGenerateCount = 0;
        String shortUri;
        while (true) {
            if (customGenerateCount > 10) {
                throw new ServiceException("短链接频繁生成，请稍后重试");
            }
            String originUrl = requestParam.getOriginUrl();
            shortUri = HashUtil.hashToBase62(originUrl);
            LambdaQueryWrapper<ShortLinkDO> queryWrapper =
                    Wrappers.lambdaQuery(ShortLinkDO.class)
                            .eq(ShortLinkDO::getFullShortUrl, requestParam.getDomain() + "/" + shortUri);
            ShortLinkDO shortLinkDO = baseMapper.selectOne(queryWrapper);
            if (shortLinkDO == null) {
                break;
            }
            customGenerateCount++;
        }
        return shortUri;
    }
}
