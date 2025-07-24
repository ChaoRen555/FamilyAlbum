package com.album.controller;




import com.album.common.Result;
import com.album.entity.Admin;
import com.album.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

     @GetMapping("/selectById/{id}")
     public Result selectById(@PathVariable Integer id){
          Admin admin = adminService.selectById(id);
         return Result.success(admin);
     }

     @DeleteMapping("/deleteById/{id}")
     public Result deleteById(@PathVariable Integer id){
         adminService.deleteById(id);
         return Result.success();
     }


}
