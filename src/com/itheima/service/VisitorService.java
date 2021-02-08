package com.itheima.service;

import com.itheima.po.PageInfo;
import com.itheima.po.Visitor;

import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 * @author: TaoYe
 * @create: 2020-09-14 12:39
 **/
public interface VisitorService {
    //分页查询
    public PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone , Integer pageIndex, Integer pageSize);
    public int addVisitor(Visitor visitor);   //添加访客信息
    public List<Visitor> getAll();
}
