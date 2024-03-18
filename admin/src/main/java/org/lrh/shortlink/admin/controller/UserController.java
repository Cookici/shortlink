package org.lrh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.dto.resp.UserRespDTO;
import org.lrh.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.controller
 * @ClassName: UserController
 * @Author: 63283
 * @Description: 用户管理控制层
 * @Date: 2024/3/18 14:17
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        if(result == null){
            return new Result<UserRespDTO>().setCode("-1").setMessage("用户查询为空");
        }else{
            return new Result<UserRespDTO>().setCode("0").setData(result);
        }



    }

}
