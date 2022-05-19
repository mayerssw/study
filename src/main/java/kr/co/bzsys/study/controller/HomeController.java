package kr.co.bzsys.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String homepage() {
    System.out.println("ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
    return "home";
  }

}
