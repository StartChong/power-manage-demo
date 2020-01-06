package cn.icloudit.permission.service.impl;

import cn.icloudit.permission.entity.AuthFunction;
import cn.icloudit.permission.entity.AuthFunctionExample;
import cn.icloudit.permission.entity.ComboTreeModel;
import cn.icloudit.permission.mapper.AuthFunctionMapper;
import cn.icloudit.permisson.service.IAuthFuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthFunctionServiceImpl implements IAuthFuctionService {

    @Autowired
    private AuthFunctionMapper authFunctionMapper;

    @Override
    public List<AuthFunction> queryAll() {
        return authFunctionMapper.selectByExample(null);
    }

    @Override
    public int save(AuthFunction entity) {
        return authFunctionMapper.insert(entity);
    }

    @Override
    public int delete(Object id) {
        return authFunctionMapper.deleteByPrimaryKey((Integer) id);
    }

    @Override
    public AuthFunction queryById(Object id) {
        return authFunctionMapper.selectByPrimaryKey((Integer) id);
    }

    @Override
    public int update(AuthFunction entity) {
        return authFunctionMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<AuthFunction> queryByTj(AuthFunction entity) {
        return null;
    }

    @Override
    public List<AuthFunction> queryByPager(AuthFunction entity) {
        return authFunctionMapper.selectByExample(null);
    }

    @Override
    public List<ComboTreeModel> findByExampleForComboTree() {
        AuthFunctionExample example = new AuthFunctionExample();
        example.createCriteria().andGeneratemenuEqualTo("1").andPidEqualTo("0");
        return authFunctionMapper.selectByExampleForComboTree(example);
    }

    @Override
    public List<AuthFunction> queryAllByUserId(Integer id) {
        return authFunctionMapper.selectByUserId(id);
    }
}
