package org.lrh.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.lrh.shortlink.admin.dao.entity.GroupDO;
import org.lrh.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.service
 * @ClassName: GroupService
 * @Author: 63283
 * @Description: 短链接分组接口层
 * @Date: 2024/3/21 20:08
 */

public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);


    /**
     * 新增短链接分组
     *
     * @param username  用户名
     * @param groupName 短链接分组名
     */
    void saveGroup(String username, String groupName);

    /**
     * 查询用户短链接分组集合
     *
     * @return 用户短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();
}
