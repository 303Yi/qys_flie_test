package com.fyd.service.impl;

import com.fyd.dao.TFlieDao;
import com.fyd.entity.TFlie;
import com.fyd.service.TFlieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TFlie)表服务实现类
 *
 * @author makejava
 * @since 2021-04-07 17:57:38
 */
@Service("tFlieService")
public class TFlieServiceImpl implements TFlieService {
    @Resource
    private TFlieDao tFlieDao;

    @Override
    public List<TFlie> allFile() {
        return this.tFlieDao.all();
    }

    /**
     * 通过ID查询单条数据
     *
     * @param uuid 主键
     * @return 实例对象
     */
    @Override
    public TFlie queryById(String uuid) {
        return this.tFlieDao.queryById(uuid);
    }


    @Override
    public TFlie insert(TFlie tFlie) {
        this.tFlieDao.insert(tFlie);
        return tFlie;
    }


}
