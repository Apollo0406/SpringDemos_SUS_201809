package com.helloworld.service;

import com.helloworld.entity.Area;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AreaService {
/*    //列出整个区域列表
    List<Area> queryArea();
    //按照id来查询区域
    Area queryAreaById(int areaId);
    //插入区域
    int insertArea(Area area);
    //修改区域
    int updateArea(Area area);
    //删除区域
    int deleteArea(int areaId);*/

    /**
     * 获取区域列表
     */
    List<Area> getAreaList();

    /**
     * 通过区域Id获取区域信息
     */
    Area getAreaById(int areaId);

    /**
     * 增加区域信息
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     */
    boolean deleteArea(int areaId);


}
