package cn.icloudit.permission.web.controller;



import cn.icloudit.permission.entity.AuthFunction;
import cn.icloudit.permission.entity.ComboTreeModel;
import cn.icloudit.permission.entity.User;
import cn.icloudit.permisson.service.IAuthFuctionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/authfunction")
public class AuthFunctionController {

    @Autowired
    private IAuthFuctionService authFuctionService;

    @RequestMapping("/queryall")
    @ResponseBody
    public List queryall(){
        List<AuthFunction> list = authFuctionService.queryAll();
        return list;
    }

    @RequestMapping("/queryAllByUserId")
    @ResponseBody
    public List queryAllByUserId(HttpSession session){
        User user = (User)session.getAttribute("LOGIN_USER");
        List<AuthFunction> list = authFuctionService.queryAllByUserId(user.getUser_id());
        return list;
    }

    @RequestMapping("/queryByPager")
    @ResponseBody
    public Object queryByPager(@RequestParam(value = "rows",defaultValue = "2") int rows, @RequestParam(value = "page",defaultValue = "1") int page,AuthFunction authFunction){
        PageHelper.startPage(page,rows);
        List<AuthFunction> list = authFuctionService.queryByPager(authFunction);
        PageInfo<AuthFunction> pageInfo = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>();
        map.put("rows", list);
        map.put("total", pageInfo.getTotal());
        return map;
    }

    @RequestMapping("/listAjaxForComboTree")
    @ResponseBody
    public List listAjaxForComboTree(){
        List<ComboTreeModel> list = authFuctionService.findByExampleForComboTree();
        return list;
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(AuthFunction authFunction){
        authFuctionService.save(authFunction);
        return "";
    }

    @RequestMapping("/toupdate/{id}")
    public String toupdate(@PathVariable("id") Integer id, Model model){
        AuthFunction authFunction = authFuctionService.queryById(id);
        model.addAttribute("entity",authFunction);
        return "admin/function_update";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(AuthFunction authFunction){
        authFuctionService.update(authFunction);
        return "";
    }

    @RequestMapping("/delete/{ids}")
    public String delete(@PathVariable("ids") Integer[] ids){
        for (int i = 0; i < ids.length; i++){
            authFuctionService.delete((Integer) ids[i]);
        }
        return "system/function";
    }
}
