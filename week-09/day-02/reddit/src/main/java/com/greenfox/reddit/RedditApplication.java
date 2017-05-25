package com.greenfox.reddit;

import com.greenfox.reddit.service.AuthenticationBasedAccessInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class RedditApplication extends WebMvcConfigurerAdapter {

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Autowired
  AuthenticationBasedAccessInterceptor authenticationBasedAccessInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(authenticationBasedAccessInterceptor)
            .addPathPatterns("/posts")
            .addPathPatterns("/posts/*");
  }
}
