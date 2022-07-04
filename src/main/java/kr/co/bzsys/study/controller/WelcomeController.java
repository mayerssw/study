package kr.co.bzsys.study.controller;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WelcomeController {

  @GetMapping("/welcome")
  public String welcome(String name, Model model) {
    model.addAttribute("name", "이현");
    model.addAttribute("today", LocalDateTime.now());
    return "welcome";
  }

}
