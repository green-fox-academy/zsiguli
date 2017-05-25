package com.greenfox.reddit;

import com.greenfox.reddit.service.AuthenticationBasedAccessInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class RedditApplication extends WebMvcConfigurerAdapter {

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new AuthenticationBasedAccessInterceptor())
            .addPathPatterns("/posts")
            .addPathPatterns("/posts/*");
  }
}
