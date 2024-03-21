package org.lrh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.service.GroupService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.controller
 * @ClassName: GroupController
 * @Author: 63283
 * @Description: 短链接分组控制层
 * @Date: 2024/3/21 20:10
 */
@RestController
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;
}
