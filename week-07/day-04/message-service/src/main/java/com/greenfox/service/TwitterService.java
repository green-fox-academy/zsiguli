package com.greenfox.service;

public class TwitterService implements MessageService {

  @Override
  public void sendingMessage(String text, String address) {
    System.out.println("Tweat: " + text + " from: " + address);
  }
}
