package cn.icloudit.permission.web.controller;


import cn.icloudit.permission.entity.AuthRole;
import cn.icloudit.permission.entity.RoleFunctionKey;
import cn.icloudit.permisson.service.IAuthRoleService;
import cn.icloudit.permisson.service.IRoleFunctionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/authRole")
public class AuthRoleController {
    
    @Autowired
    private IAuthRoleService authRoleService;
    @Autowired
    private IRoleFunctionService roleFunctionService;
    
    @RequestMapping("/queryByPager")
    @ResponseBody
    public Object queryByPager(@RequestParam(value = "rows",defaultValue = "2") int rows, @RequestParam(value = "page",defaultValue = "1") int page, AuthRole authRole){
        PageHelper.startPage(page,rows);
        List<AuthRole> list = authRoleService.queryByPager(authRole);
        PageInfo<AuthRole> pageInfo = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>();
        map.put("rows", list);
        map.put("total", pageInfo.getTotal());
        return map;
    }


    @RequestMapping("/add/{ids}")
    @ResponseBody
    @RequiresPermissions("role.add")
    public String add(@PathVariable("ids") Integer[] ids, AuthRole AuthRole){
        authRoleService.saveAndFunction(AuthRole,ids);
        return "";
    }

    @RequestMapping("/toupdate/{id}")
    public String toupdate(@PathVariable("id") Integer id, Model model){
        AuthRole authRole = authRoleService.queryById(id);
        List<RoleFunctionKey> list = roleFunctionService.queryByRoleId(id);
        String authIds = "";
        for (RoleFunctionKey r : list){
            if (authIds != ""){
                authIds += ",";
            }
            authIds += r.getRole_function_id();
        }
        model.addAttribute("entity",authRole);
        model.addAttribute("authIds",authIds);
        return "admin/role_update";
    }

    @RequestMapping("/update/{ids}")
    @ResponseBody
    public String update(@PathVariable("ids") Integer[] ids,AuthRole authRole){
        authRoleService.updateAndFunction(authRole,ids);
        return "";
    }

    @RequestMapping("/delete/{ids}")
    public String delete(@PathVariable("ids") Integer[] ids){
        for (int i = 0; i < ids.length; i++){
            authRoleService.delete(ids[i]);
        }
        return "system/role";
    }
}
