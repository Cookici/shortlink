package org.lrh.shortlink.admin.common.biz.user;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: shortlink
 * @Package: org.lrh.shortlink.admin.common.biz.user
 * @ClassName: UserInfoDTO
 * @Author: 63283
 * @Description: 用户信息实体
 * @Date: 2024/3/21 20:27
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDTO {
    /**
     * 用户 ID
     */
    @JSONField(name = "id")
    private String userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;
}
