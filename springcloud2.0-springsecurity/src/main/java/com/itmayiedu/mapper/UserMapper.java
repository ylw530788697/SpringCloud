package com.itmayiedu.mapper;

import com.itmayiedu.entity.Permission;
import com.itmayiedu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author v_liwenyang
 */

public interface UserMapper {

    @Select(" select * from sys_user where username = #{userName}")
    public User findByUsername(@Param("userName") String userName);

    // 查询用户的权限
    @Select(" select permission.* from sys_user user" + " inner join sys_user_role user_role"
            + " on user.id = user_role.user_id inner join "
            + "sys_role_permission role_permission on user_role.role_id = role_permission.role_id "
            + " inner join sys_permission permission on role_permission.perm_id = permission.id where user.username = #{userName};")
    List<Permission> findPermissionByUsername(@Param("userName") String userName);
}
