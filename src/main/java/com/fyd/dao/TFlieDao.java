package com.fyd.dao;

import com.fyd.entity.TFlie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TFlie)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-07 17:57:37
 */
public interface TFlieDao {

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
     * @return 影响行数
     */
    int insert(TFlie tFlie);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TFlie> 实例对象列表
     * @return 影响行数
     */

    List<TFlie> all();
}
