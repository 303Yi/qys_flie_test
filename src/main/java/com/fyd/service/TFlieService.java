package com.fyd.service;

import com.fyd.entity.TFlie;

import java.util.List;

/**
 * (TFlie)表服务接口
 *
 * @author makejava
 * @since 2021-04-07 17:57:37
 */
public interface TFlieService {

    List<TFlie> allFile();

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    TFlie queryById(String uuid);


    /**
     * 新增数据
     *
     * @param tFlie 实例对象
     * @return 实例对象
     */
    TFlie insert(TFlie tFlie);



}
