package cn.icloudit.permission.mapper;

import cn.icloudit.permission.entity.RoleFunctionExample;
import cn.icloudit.permission.entity.RoleFunctionKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleFunctionMapper {
    int countByExample(RoleFunctionExample example);

    int deleteByExample(RoleFunctionExample example);

    int deleteByPrimaryKey(RoleFunctionKey key);

    int insert(RoleFunctionKey record);

    int insertSelective(RoleFunctionKey record);

    List<RoleFunctionKey> selectByExample(RoleFunctionExample example);

    int updateByExampleSelective(@Param("record") RoleFunctionKey record, @Param("example") RoleFunctionExample example);

    int updateByExample(@Param("record") RoleFunctionKey record, @Param("example") RoleFunctionExample example);

    int deleteByRoleId(Integer roleid);
}