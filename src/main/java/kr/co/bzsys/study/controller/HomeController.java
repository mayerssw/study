package kr.co.bzsys.study.controller;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

  @RequestMapping(value="/home")
  public String requestToday(Model model) {
    model.addAttribute("today", LocalDateTime.now());
    model.addAttribute("name", "혜인혜인");
    log.info("model" + model);
    return "home";
  }
}
