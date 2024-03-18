package org.lrh.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lrh.shortlink.admin.dao.entity.UserDO;
import org.lrh.shortlink.admin.dto.resp.UserRespDTO;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.service
 * @ClassName: UserService
 * @Author: 63283
 * @Description: 用户接口层
 * @Date: 2024/3/18 14:42
 */

public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户返回信息
     */
    UserRespDTO getUserByUsername(String username);

}
