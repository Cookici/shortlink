package org.lrh.shortlink.projectcore.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.projectcore.dao.entity.ShortLinkDO;
import org.lrh.shortlink.projectcore.dao.mapper.ShortLinkMapper;
import org.lrh.shortlink.projectcore.dto.req.RecycleBinSaveReqDTO;
import org.lrh.shortlink.projectcore.dto.req.ShortLinkRecycleBinPageReqDTO;
import org.lrh.shortlink.projectcore.dto.resp.ShortLinkPageRespDTO;
import org.lrh.shortlink.projectcore.service.RecycleBinService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import static org.lrh.shortlink.projectcore.common.constant.RedisKeyConstant.GOTO_SHORT_LINK_KEY;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.projectcore.service.impl
 * @ClassName: RecycleBinServiceImpl
 * @Author: 63283
 * @Description: 回收站管理接口实现层
 * @Date: 2024/4/27 下午2:48
 */
@Service
@RequiredArgsConstructor
public class RecycleBinServiceImpl extends ServiceImpl<ShortLinkMapper, ShortLinkDO> implements RecycleBinService {

    private final StringRedisTemplate stringRedisTemplate;

    @Override
    public void saveRecycleBin(RecycleBinSaveReqDTO requestParam) {
        LambdaUpdateWrapper<ShortLinkDO> updateWrapper = Wrappers.lambdaUpdate(ShortLinkDO.class)
                .eq(ShortLinkDO::getFullShortUrl, requestParam.getFullShortUrl())
                .eq(ShortLinkDO::getGid, requestParam.getGid())
                .eq(ShortLinkDO::getEnableStatus, 0)
                .eq(ShortLinkDO::getDelFlag, 0);
        ShortLinkDO shortLinkDO = ShortLinkDO.builder()
                .enableStatus(1)
                .build();
        baseMapper.update(shortLinkDO, updateWrapper);
        stringRedisTemplate.delete(
                String.format(GOTO_SHORT_LINK_KEY,requestParam.getFullShortUrl()));


    }

    @Override
    public IPage<ShortLinkPageRespDTO> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam){
        IPage<ShortLinkDO> resultPage = baseMapper.pageRecycleBinShortLink(requestParam);
        return resultPage.convert(each -> {
            ShortLinkPageRespDTO result = BeanUtil.toBean(each, ShortLinkPageRespDTO.class);
            result.setDomain(result.getDomain());
            return result;
        });
    }

}
