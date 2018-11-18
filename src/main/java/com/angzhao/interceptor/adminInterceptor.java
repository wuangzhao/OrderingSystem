package com.angzhao.interceptor;

import com.angzhao.entity.userEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class adminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println(uri);
        if (!uri.contains("/admin/login")) {
            userEntity userEntity = (userEntity) request.getSession().getAttribute("user");
            if (userEntity != null && userEntity.getUserGroup() == 2) {
                return true;
            } else {
                response.sendRedirect(request.getContextPath()+"/admin/login");
            }

        } else {
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
