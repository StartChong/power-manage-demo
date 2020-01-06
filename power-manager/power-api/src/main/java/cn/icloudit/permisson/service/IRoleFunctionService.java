package cn.icloudit.permisson.service;

import cn.icloudit.permission.entity.RoleFunctionKey;

import java.util.List;

public interface IRoleFunctionService extends IBaseService<RoleFunctionKey> {
    List<RoleFunctionKey> queryByRoleId(Integer roleid);
}
