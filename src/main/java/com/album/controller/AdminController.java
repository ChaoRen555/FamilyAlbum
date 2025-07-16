package com.album.controller;

import com.album.entity.Admin;
import com.album.mapper.AdminMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    private final AdminMapper adminMapper;

    public AdminController(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @GetMapping("/admin/list")
    public List<Admin> listAdmins() {
        return adminMapper.findAll();
    }
}
