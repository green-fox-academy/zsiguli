package com.greenfox.service;

public class EmailService implements MessageService {

  @Override
  public void sendingMessage(String text, String address) {
    System.out.println("Email sent from: " + address + " with message=" + text);
  }
}
