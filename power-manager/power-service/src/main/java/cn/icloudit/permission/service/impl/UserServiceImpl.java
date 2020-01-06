package cn.icloudit.permission.service.impl;

import cn.icloudit.permission.entity.User;
import cn.icloudit.permission.entity.UserExample;
import cn.icloudit.permission.entity.UserRoleExample;
import cn.icloudit.permission.entity.UserRoleKey;
import cn.icloudit.permission.mapper.UserMapper;
import cn.icloudit.permission.mapper.UserRoleMapper;
import cn.icloudit.permisson.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public List<User> queryAll() {
        return null;
    }

    @Override
    public int save(User entity) {
        return userMapper.insert(entity);
    }

    @Override
    public int delete(Object id) {
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUser_idEqualTo((Integer) id);
        userRoleMapper.deleteByExample(example);
        return userMapper.deleteByPrimaryKey((Integer) id);
    }

    @Override
    public User queryById(Object id) {
        return userMapper.selectByPrimaryKey((Integer) id);
    }

    @Override
    public int update(User entity) {
        return userMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<User> queryByTj(User entity) {
        UserExample example = null;
        if (entity != null){
            example = new UserExample();
            UserExample.Criteria c = example.createCriteria();
            if (entity.getUsername() != null && !"".equals(entity.getUsername()) && entity.getPassword() != null && !"".equals(entity.getPassword())){
                c.andUsernameEqualTo(entity.getUsername());
                return userMapper.selectByExample(example);
            }else {
                return null;
            }
        }
        return null;
    }

    @Override
    public List<User> queryByPager(User entity) {
        return userMapper.selectByExample(null);
    }

    @Override
    public int saveAndFunction(User user, String[] roleIds) {
        userMapper.insert(user);
        for (int i = 0; i < roleIds.length; i++){
            UserRoleKey userRoleKey = new UserRoleKey();
            userRoleKey.setUser_id(user.getUser_id());
            userRoleKey.setRole_id(Integer.parseInt(roleIds[i]));
            userRoleMapper.insert(userRoleKey);
        }
        return 1;
    }

    @Override
    public int updateAndFunction(User user, String[] roleIds) {
        userMapper.updateByPrimaryKeySelective(user);
        UserRoleExample example = new UserRoleExample();
        example.createCriteria().andUser_idEqualTo(user.getUser_id());
        userRoleMapper.deleteByExample(example);
        for (int i = 0; i < roleIds.length; i++){
            UserRoleKey userRoleKey = new UserRoleKey();
            userRoleKey.setUser_id(user.getUser_id());
            userRoleKey.setRole_id(Integer.parseInt(roleIds[i]));
            userRoleMapper.insert(userRoleKey);
        }
        return 1;
    }
}
