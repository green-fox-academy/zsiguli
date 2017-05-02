package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  final static String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  final static String[] colors = {"red", "blue", "grey", "black", "yellow", "green"};

  final static int[] fontSizes = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};

  @RequestMapping("/web/greeting")
  static public String greeting(Model model, @RequestParam("name") String name) {
    int randomHello = (int) (Math.random() * hellos.length);
    int randomColor = (int) (Math.random() * colors.length);
    int randomFontSize = (int) (Math.random() * fontSizes.length);
    model.addAttribute("hello", hellos[randomHello]);
    model.addAttribute("name", name);
    model.addAttribute("loadCounter", HelloRESTController.numberOfRequests.incrementAndGet());
    model.addAttribute("color", colors[randomColor]);
    model.addAttribute("fontSize", fontSizes[randomFontSize]);
    return "greeting";
  }
}
