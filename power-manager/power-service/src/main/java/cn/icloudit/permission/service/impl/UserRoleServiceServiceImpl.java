package cn.icloudit.permission.service.impl;

import cn.icloudit.permission.entity.UserRoleKey;
import cn.icloudit.permisson.service.IUserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceServiceImpl implements IUserRoleService {
    @Override
    public List<UserRoleKey> queryAll() {
        return null;
    }

    @Override
    public int save(UserRoleKey entity) {
        return 0;
    }

    @Override
    public int delete(Object id) {
        return 0;
    }

    @Override
    public UserRoleKey queryById(Object id) {
        return null;
    }

    @Override
    public int update(UserRoleKey entity) {
        return 0;
    }

    @Override
    public List<UserRoleKey> queryByTj(UserRoleKey entity) {
        return null;
    }

    @Override
    public List<UserRoleKey> queryByPager(UserRoleKey entity) {
        return null;
    }
}
