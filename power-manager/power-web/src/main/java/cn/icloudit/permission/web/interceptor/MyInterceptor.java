package cn.icloudit.permission.web.interceptor;

import cn.icloudit.permission.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 获取请求的url
        String url = request.getRequestURI();
        if (url.indexOf("/login") > 0){
            return true;
        }
        HttpSession session = request.getSession();
        User users = (User)session.getAttribute("LOGIN_USER");
        if (users != null){
            return true;
        }
        request.setAttribute("msg","您还没有登录，请登录！");
        request.getRequestDispatcher("/login.jsp").forward(request,response);
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
