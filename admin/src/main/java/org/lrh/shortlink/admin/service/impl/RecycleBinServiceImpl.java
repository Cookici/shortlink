package org.lrh.shortlink.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.biz.user.UserContext;
import org.lrh.shortlink.admin.common.convention.excepiton.ServiceException;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.dao.entity.GroupDO;
import org.lrh.shortlink.admin.dao.mapper.GroupMapper;
import org.lrh.shortlink.admin.remote.ShortLinkActualRemoteService;
import org.lrh.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import org.lrh.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import org.lrh.shortlink.admin.service.RecycleBinService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.service.impl
 * @ClassName: RecycleBinServiceImpl
 * @Author: 63283
 * @Description: URL 回收站接口实现层
 * @Date: 2024/4/27 下午9:19
 */

@Service(value = "recycleBinServiceImplByAdmin")
@RequiredArgsConstructor
public class RecycleBinServiceImpl implements RecycleBinService {

    private final ShortLinkActualRemoteService shortLinkActualRemoteService;
    private final GroupMapper groupMapper;

    @Override
    public Result<Page<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(GroupDO::getDelFlag, 0);
        List<GroupDO> groupDOList = groupMapper.selectList(queryWrapper);
        if (CollUtil.isEmpty(groupDOList)) {
            throw new ServiceException("用户无分组信息");
        }
        requestParam.setGidList(groupDOList.stream().map(GroupDO::getGid).toList());
        return shortLinkActualRemoteService.pageRecycleBinShortLink(requestParam.getGidList(), requestParam.getCurrent(), requestParam.getSize());
    }
}