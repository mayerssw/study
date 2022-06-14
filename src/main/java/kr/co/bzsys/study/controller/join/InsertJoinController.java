package kr.co.bzsys.study.controller.join;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class InsertJoinController {

  @RequestMapping(value = "/join")
  public String moveJoin() {
    return "/join/insertJoin";
  }

}
