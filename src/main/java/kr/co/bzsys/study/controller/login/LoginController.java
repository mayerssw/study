package kr.co.bzsys.study.controller.login;

import kr.co.bzsys.study.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class LoginController {

  @Autowired
  LoginService loginService;

  @GetMapping(value = "/login")
  public String selectLoginUser() {
    return "/index";
  }

  @GetMapping(value = "/loginSuccess")
  public String successLogin() {
    return "/main/main";
  }

  @GetMapping(value = "/loginDenied")
  public String failedLogin() {
    return "/login/loginDenied";
  }

}
