package com.chariot.dojodemos.mobile.web;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Html5Interceptor extends HandlerInterceptorAdapter {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    return super.preHandle(request, response, handler);    //To change body of overridden methods use File | Settings | File Templates.
  }

  @Override
  public void postHandle(HttpServletRequest request,
                         HttpServletResponse response,
                         Object handler, ModelAndView modelAndView) throws Exception {
    /*if (!response.isCommitted()) {
        response.getWriter().println("<!DOCTYPE html>");
        response.getWriter().flush();
    } */
    super.postHandle(request, response, handler, modelAndView);
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    super.afterCompletion(request, response, handler, ex);    //To change body of overridden methods use File | Settings | File Templates.
  }
}
