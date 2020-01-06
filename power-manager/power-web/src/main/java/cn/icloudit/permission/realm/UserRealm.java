package cn.icloudit.permission.realm;

import cn.icloudit.permission.entity.AuthFunction;
import cn.icloudit.permission.entity.AuthFunctionExample;
import cn.icloudit.permission.entity.User;
import cn.icloudit.permission.entity.UserExample;
import cn.icloudit.permission.mapper.AuthFunctionMapper;
import cn.icloudit.permission.mapper.UserMapper;
import cn.icloudit.permisson.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.logging.Logger;

public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AuthFunctionMapper functionMapper;

    private Logger logger = Logger.getLogger("cn.icloudit.permission.realm.UserRealm");

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        /*登录认证成功后取出user*/
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        List<AuthFunction> list = null;
        AuthFunctionExample example = new AuthFunctionExample();
        if (user.getUsername().equals("admin")){
            /*超级管理员内置用户，查询所有权限数据*/
            list = functionMapper.selectByExample(example);
        }else {
            /*查询出当前用户所具有的全部AunthFunction*/
            list = functionMapper.selectByUserId(user.getUser_id());
        }
        for (AuthFunction function : list){
            info.addStringPermission(function.getCode());
        }
        return info;
    }

    // 认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken passwordToken = (UsernamePasswordToken)token;
        // 获得页面输入的用户名
        String username = passwordToken.getUsername();
        // 根据用户名查询数据库中的密码
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<User> list = userMapper.selectByExample(example);
        User user = list != null && list.size() > 0 ?list.get(0):null;
        if (user == null){
            // 页面输入用户不存在
            return null;
        }
        // 简单认证信息对象
        AuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(),this.getName());
        // 框架负责对比数据库中的密码与页面输入的密码是否一致
        return info;
    }
}
