package kr.co.bzsys.study.controller.main;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

  @RequestMapping(value ="/main")
  public void mainView(){
    System.out.println("와써??");
  }

}
