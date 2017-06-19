package com.xawl.car.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/12/21.
 */
public class JSONPInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,Authorization");
        response.setHeader("Access-Control-Allow-Credentials","true");
//        String url = request.getRequestURI();
//        if (url.indexOf("login")>=0){
//            return true;
//        }
//        HttpSession session = request.getSession();
//        Cookie[] cookies = request.getCookies();
//        System.out.print("xuzixxxxxxxxxx"+cookies);
//        if (cookies!=null) {
//            for (int i = 0; i < cookies.length; i++) {
//                Object attribute = session.getAttribute(cookies[i].getValue());
//                if (attribute != null) {
//                    return true;
//                }
//            }
//        }
//        PrintWriter writer = response.getWriter();
//        writer.write("{\"msg\": 0}");
//        return false;
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
