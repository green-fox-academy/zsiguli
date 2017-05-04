package com.greenfox.configuration;

import com.greenfox.service.EmailService;
import com.greenfox.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MessageConfiguration {
  @Bean
  public TwitterService twitterService() {
    return new TwitterService();
  }

  @Primary
  @Bean
  public EmailService emailService() {
    return new EmailService();
  }

  @Bean MessageProceeder messageProceeder() {
    return new MessageProceeder();
  }
}
