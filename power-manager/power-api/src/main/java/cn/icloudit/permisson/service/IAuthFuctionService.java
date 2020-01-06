package cn.icloudit.permisson.service;

import cn.icloudit.permission.entity.AuthFunction;
import cn.icloudit.permission.entity.ComboTreeModel;

import java.util.List;

public interface IAuthFuctionService extends IBaseService<AuthFunction> {
    List<ComboTreeModel> findByExampleForComboTree();

    List<AuthFunction> queryAllByUserId(Integer id);
}
