package cn.icloudit.permission.web.controller;



import cn.icloudit.permission.entity.AuthRole;
import cn.icloudit.permission.entity.User;
import cn.icloudit.permission.entity.UserRoleKey;
import cn.icloudit.permisson.service.IAuthRoleService;
import cn.icloudit.permisson.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IAuthRoleService authRoleService;


    @RequestMapping("/login")
    public String login(User user, HttpSession session, String checkcode, Model model){
        if (checkcode != null && !"".equals(checkcode)){
            String code = (String)session.getAttribute("regcode");
            if (checkcode.equals(code)){
//                List<User> list = userService.queryByTj(user);
//                if (list.size() > 0){
//                    session.setAttribute("LOGIN_USER",list.get(0));
//                    return  "system/main";
//                } else {
//                    model.addAttribute("msg","账号或密码错误！");
//                    return "forward:/login.jsp";
//                }
                Subject subject = SecurityUtils.getSubject();
                AuthenticationToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
                try {
                    subject.login(token);
                } catch (Exception e){
                    e.printStackTrace();
                    model.addAttribute("msg","账号或密码错误！");
                    return "redirect:/login.jsp";
                }
                User user1 = (User)subject.getPrincipal();
                session.setAttribute("LOGIN_USER",user1);
                return "system/main";
            } else {
                model.addAttribute("msg","验证码输入错误，请重新输入验证码！");
                return "redirect:/login.jsp";
            }
        }
        model.addAttribute("msg","请输入验证码！");
        return "redirect:/login.jsp";
    }

    @RequestMapping("/loginOut")
    public String loginOut(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login.jsp";
    }

    @RequestMapping("/queryByPager")
    @ResponseBody
    public Object queryByPager(@RequestParam(value = "rows",defaultValue = "2") int rows, @RequestParam(value = "page",defaultValue = "1") int page, User user){
        PageHelper.startPage(page,rows);
        List<User> list = userService.queryByPager(user);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>();
        map.put("rows", list);
        map.put("total", pageInfo.getTotal());
        return map;
    }
    @RequestMapping("/toadd")
    public String toadd(Model model){
        List<AuthRole> roleList = authRoleService.queryAll();
        model.addAttribute("roleList",roleList);
        return "admin/staff_add";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(User user, String[] roleIds){
        userService.saveAndFunction(user,roleIds);
        return "";
    }

    @RequestMapping("/toupdate/{id}")
    public String toupdate(@PathVariable("id") Integer id, Model model){
        User user = userService.queryById(id);
        String roleIds = "";
        for (UserRoleKey r : user.getUserRole()){
            if (roleIds != ""){
                roleIds += ",";
            }
            roleIds += r.getRole_id();
        }
        List<AuthRole> roleList = authRoleService.queryAll();
        model.addAttribute("roleList",roleList);
        model.addAttribute("entity",user);
        model.addAttribute("roleIds",roleIds);
        return "admin/staff_update";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(User user,  String[] roleIds){
        userService.updateAndFunction(user,roleIds);
        return "";
    }

    @RequestMapping("/delete/{ids}")
    public String delete(@PathVariable("ids") Integer[] ids){
        for (int i = 0; i < ids.length; i++){
            userService.delete(ids[i]);
        }
        return "system/staff";
    }

}
