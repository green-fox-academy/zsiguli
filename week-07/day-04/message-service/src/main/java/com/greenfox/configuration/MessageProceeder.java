package com.greenfox.configuration;

import com.greenfox.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

  @Autowired
  MessageService messageService;

  public void processMessage(String text, String address) {
    messageService.sendingMessage();
  }
}
