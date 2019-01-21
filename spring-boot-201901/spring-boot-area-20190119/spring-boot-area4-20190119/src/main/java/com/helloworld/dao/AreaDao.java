package com.helloworld.dao;

import com.helloworld.entity.Area;

import java.util.List;

public interface AreaDao {
    //列出整个区域列表
    List<Area> queryArea();
    //按照id来查询区域
    Area queryAreaById(int areaId);
    //插入区域
    int insertArea(Area area);
    //修改区域
    int updateArea(Area area);
    //删除区域
    int deleteArea(int areaId);
}
