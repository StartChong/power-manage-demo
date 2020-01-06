package cn.icloudit.permission.mapper;

import cn.icloudit.permission.entity.AuthRole;
import cn.icloudit.permission.entity.AuthRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthRoleMapper {
    int countByExample(AuthRoleExample example);

    int deleteByExample(AuthRoleExample example);

    int deleteByPrimaryKey(Integer role_id);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    List<AuthRole> selectByExample(AuthRoleExample example);

    AuthRole selectByPrimaryKey(Integer role_id);

    int updateByExampleSelective(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByExample(@Param("record") AuthRole record, @Param("example") AuthRoleExample example);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);
}