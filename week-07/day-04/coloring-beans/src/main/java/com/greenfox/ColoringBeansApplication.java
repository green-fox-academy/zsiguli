package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ColoringBeansApplication implements CommandLineRunner{

  @Autowired
  RedColor redColor;
  @Autowired
  BlueColor blueColor;
  @Autowired
  GreenColor greenColor;

	public static void main(String[] args) {
		SpringApplication.run(ColoringBeansApplication.class, args);
	}

  @Override
  public void run(String... args) throws Exception {
    List<MyColor> colors = new ArrayList<>();
    colors.add(redColor);
    colors.add(blueColor);
    colors.add(greenColor);

    for (MyColor color : colors) {
      color.printColor();
    }
  }
}
