package org.lrh.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.lrh.shortlink.admin.dao.entity.UserDO;
import org.lrh.shortlink.admin.dao.mapper.UserMapper;
import org.lrh.shortlink.admin.dto.resp.UserRespDTO;
import org.lrh.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.service.impl
 * @ClassName: UserServiceImpl
 * @Author: 63283
 * @Description: 用户接口实现层
 * @Date: 2024/3/18 14:43
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                        .eq(UserDO::getUsername,username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        UserRespDTO result = new UserRespDTO();
        BeanUtils.copyProperties(userDO,result);
        return result;
    }
}
