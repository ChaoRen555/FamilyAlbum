package com.album.mapper;

import com.album.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {

    @Select("SELECT * FROM admin")
    List<Admin> findAll();
}
