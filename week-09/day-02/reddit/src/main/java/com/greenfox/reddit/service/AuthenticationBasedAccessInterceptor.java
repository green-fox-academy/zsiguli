package com.greenfox.reddit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class AuthenticationBasedAccessInterceptor extends HandlerInterceptorAdapter {

  @Autowired
  Session session;

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler) throws IOException {
    if (session.isAuthenticated()) {
      return true;
    } else {
      response.sendRedirect("/");
      return false;
    }
  }
}