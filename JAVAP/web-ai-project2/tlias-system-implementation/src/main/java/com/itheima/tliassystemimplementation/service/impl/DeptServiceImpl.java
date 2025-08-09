package com.itheima.tliassystemimplementation.service.impl;

import com.itheima.tliassystemimplementation.mapper.DeptMapper;
import com.itheima.tliassystemimplementation.pojo.Dept;
import com.itheima.tliassystemimplementation.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
