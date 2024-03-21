package org.lrh.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.lrh.shortlink.admin.dao.entity.GroupDO;
import org.lrh.shortlink.admin.dao.mapper.GroupMapper;
import org.lrh.shortlink.admin.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.service.impl
 * @ClassName: GroupServiceImpl
 * @Author: 63283
 * @Description: 短链接分组接口实现层
 * @Date: 2024/3/21 20:09
 */

@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {

}
