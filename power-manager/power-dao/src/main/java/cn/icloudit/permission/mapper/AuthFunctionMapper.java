package cn.icloudit.permission.mapper;

import cn.icloudit.permission.entity.AuthFunction;
import cn.icloudit.permission.entity.AuthFunctionExample;
import cn.icloudit.permission.entity.ComboTreeModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthFunctionMapper {
    int countByExample(AuthFunctionExample example);

    int deleteByExample(AuthFunctionExample example);

    int deleteByPrimaryKey(Integer auth_fuction_id);

    int insert(AuthFunction record);

    int insertSelective(AuthFunction record);

    List<AuthFunction> selectByExample(AuthFunctionExample example);

    AuthFunction selectByPrimaryKey(Integer auth_fuction_id);

    int updateByExampleSelective(@Param("record") AuthFunction record, @Param("example") AuthFunctionExample example);

    int updateByExample(@Param("record") AuthFunction record, @Param("example") AuthFunctionExample example);

    int updateByPrimaryKeySelective(AuthFunction record);

    int updateByPrimaryKey(AuthFunction record);

    List<AuthFunction> selectByUserId(Integer userId);

    List<ComboTreeModel> selectByExampleForComboTree(AuthFunctionExample example);
    List<ComboTreeModel> selectByPidForComboTree(Integer auth_fuction_id);
}