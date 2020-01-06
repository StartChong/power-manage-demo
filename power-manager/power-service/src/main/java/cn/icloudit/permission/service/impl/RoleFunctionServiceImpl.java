package cn.icloudit.permission.service.impl;

import cn.icloudit.permission.entity.RoleFunctionExample;
import cn.icloudit.permission.entity.RoleFunctionKey;
import cn.icloudit.permission.mapper.RoleFunctionMapper;
import cn.icloudit.permisson.service.IRoleFunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleFunctionServiceImpl implements IRoleFunctionService {

    @Autowired
    private RoleFunctionMapper roleFunctionMapper;

    @Override
    public List<RoleFunctionKey> queryAll() {
        return null;
    }

    @Override
    public int save(RoleFunctionKey entity) {
        return 0;
    }

    @Override
    public int delete(Object id) {
        return 0;
    }

    @Override
    public RoleFunctionKey queryById(Object id) {
        return null;
    }

    @Override
    public int update(RoleFunctionKey entity) {
        return 0;
    }

    @Override
    public List<RoleFunctionKey> queryByTj(RoleFunctionKey entity) {
        return null;
    }

    @Override
    public List<RoleFunctionKey> queryByPager(RoleFunctionKey entity) {
        return null;
    }

    @Override
    public List<RoleFunctionKey> queryByRoleId(Integer roleid) {
        RoleFunctionExample example = new RoleFunctionExample();
        example.createCriteria().andRole_idEqualTo((Integer) roleid);
        return roleFunctionMapper.selectByExample(example);
    }
}
