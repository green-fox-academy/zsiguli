package com.greenfox.controllers;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping("/")
  public String listTodos(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @RequestMapping("/addTodo")
  public String addTodo(Model model,
                        @RequestParam(value = "description") String description) {
    todoRepository.save(new Todo(description));
    model.addAttribute("todos", todoRepository.findAll());
    return "redirect:/";
  }
}
