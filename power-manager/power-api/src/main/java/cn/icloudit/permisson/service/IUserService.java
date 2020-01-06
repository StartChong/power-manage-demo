package cn.icloudit.permisson.service;

import cn.icloudit.permission.entity.User;

public interface IUserService extends IBaseService<User> {

    int saveAndFunction(User user,String[] roleIds);

    int updateAndFunction(User user,String[] roleIds);
}
