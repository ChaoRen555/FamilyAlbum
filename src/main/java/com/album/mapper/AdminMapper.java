package com.album.mapper;

import com.album.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface AdminMapper {

    @Select("select * from admin where username =#{username}")
    Admin getByUsername(String username);


    void insert(Admin admin);
}
