package cn.icloudit.permission.service.impl;

import cn.icloudit.permission.entity.AuthRole;
import cn.icloudit.permission.entity.RoleFunctionExample;
import cn.icloudit.permission.entity.RoleFunctionKey;
import cn.icloudit.permission.mapper.AuthRoleMapper;
import cn.icloudit.permission.mapper.RoleFunctionMapper;
import cn.icloudit.permisson.service.IAuthRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthRoleServiceImpl implements IAuthRoleService {

    @Autowired
    private AuthRoleMapper authRoleMapper;
    @Autowired
    private RoleFunctionMapper roleFunctionMapper;

    @Override
    public List<AuthRole> queryAll() {
        return authRoleMapper.selectByExample(null);
    }

    @Override
    public int save(AuthRole entity) {
        return authRoleMapper.insert(entity);
    }

    @Override
    public int delete(Object id) {
        roleFunctionMapper.deleteByRoleId((Integer) id);
        return authRoleMapper.deleteByPrimaryKey((Integer) id);
    }

    @Override
    public AuthRole queryById(Object id) {
        return authRoleMapper.selectByPrimaryKey((Integer) id);
    }

    @Override
    public int update(AuthRole entity) {
        return authRoleMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<AuthRole> queryByTj(AuthRole entity) {
        return null;
    }

    @Override
    public List<AuthRole> queryByPager(AuthRole entity) {
        return authRoleMapper.selectByExample(null);
    }

    @Override
    public int saveAndFunction(AuthRole authRole, Integer[] ids) {
        authRoleMapper.insert(authRole);
        for (int i = 0; i < ids.length; i++){
            RoleFunctionKey roleFunctionKey = new RoleFunctionKey();
            roleFunctionKey.setRole_function_id(ids[i]);
            roleFunctionKey.setRole_id(authRole.getRole_id());
            roleFunctionMapper.insert(roleFunctionKey);
        }
        return 1;
    }

    @Override
    public int updateAndFunction(AuthRole authRole, Integer[] ids) {
        authRoleMapper.updateByPrimaryKeySelective(authRole);
        roleFunctionMapper.deleteByRoleId(authRole.getRole_id());
        for (int i = 0; i < ids.length; i++){
            RoleFunctionKey roleFunctionKey = new RoleFunctionKey();
            roleFunctionKey.setRole_function_id(ids[i]);
            roleFunctionKey.setRole_id(authRole.getRole_id());
            roleFunctionMapper.insert(roleFunctionKey);
        }
        return 1;
    }
}
