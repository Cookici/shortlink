package org.lrh.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.lrh.shortlink.admin.common.convention.result.Result;
import org.lrh.shortlink.admin.common.convention.result.Results;
import org.lrh.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import org.lrh.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import org.lrh.shortlink.admin.service.GroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


    /**
     * 新增短链接分组
     */
    @PostMapping("/api/short-link/admin/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }


    /**
     * 查询短链接分组集合
     */
    @GetMapping("/api/short-link/admin/v1/group")
    public Result<List<ShortLinkGroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }


}
