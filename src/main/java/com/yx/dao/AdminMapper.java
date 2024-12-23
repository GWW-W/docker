package com.yx.dao;

import com.yx.po.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(Admin record);
    int insertSelective(Admin record);
    Admin selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Admin record);
    int updateByPrimaryKey(Admin record);

    /**
     * 管理员查询
     */
    List<Admin> queryAdminInfoAll(Admin admin);

    /**
     * 根据用户名和密码查询用户信息
     */
    Admin queryUserByNameAndPassword(@Param("username") String username,@Param("password") String password);
}