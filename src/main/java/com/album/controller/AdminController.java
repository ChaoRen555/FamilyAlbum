package com.album.controller;




import com.album.common.Result;
import com.album.entity.Admin;
import com.album.mapper.AdminMapper;
import com.album.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

     @Autowired
     private AdminService adminService;

     @PostMapping("/add")
     public Result addNew(@RequestBody Admin admin){
         log.info("New Admin : {}", admin);
         adminService.add(admin);
         return Result.success();
     }



}
