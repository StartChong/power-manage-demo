package cn.icloudit.permisson.service;

import cn.icloudit.permission.entity.AuthRole;

public interface IAuthRoleService extends IBaseService<AuthRole> {
    int saveAndFunction(AuthRole authRole,Integer[] ids);
    int updateAndFunction(AuthRole authRole,Integer[] ids);
}
