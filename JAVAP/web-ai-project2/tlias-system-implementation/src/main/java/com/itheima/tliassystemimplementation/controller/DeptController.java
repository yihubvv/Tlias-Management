package com.itheima.tliassystemimplementation.controller;
import com.itheima.tliassystemimplementation.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//包含ResponseBody:将方法的返回值直接作为数据返回给前端
public class DeptController {
    @Autowired
    DeptService deptService;

    @GetMapping("/dept")
    public Result list(){
        System.out.println("查看全部部门数据");
        List<Dept> list =  deptService.list();
        return Result.success(list);
    }
}
