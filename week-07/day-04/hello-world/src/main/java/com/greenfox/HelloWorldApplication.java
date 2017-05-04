package com.greenfox;

import com.greenfox.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner{

  @Autowired
  HelloWorld helloWorld;

  public static void main(String[] args) {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    helloWorld.setMessage("Hello World!");
    helloWorld.getMessage();
  }
}
