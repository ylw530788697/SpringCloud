package com.itmayiedu.mapper;

import com.itmayiedu.entity.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author v_liwenyang
 */
public interface PermissionMapper {
    // 查询苏所有权限
    @Select(" select * from sys_permission ")
    List<Permission> findAllPermission();
}
