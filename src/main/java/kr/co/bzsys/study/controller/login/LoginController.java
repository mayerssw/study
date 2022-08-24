package kr.co.bzsys.study.controller.login;

import kr.co.bzsys.study.dto.login.LoginDto;
import kr.co.bzsys.study.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class LoginController {

  @Autowired
  LoginService loginService;

  @RequestMapping(value = "/login")
  public String selectLoginUser(LoginDto loginDto) {
    String userId = loginDto.getUserId();
    String password = loginDto.getPassword();

    boolean result = loginService.selectLoginUser(userId, password);
    if(result){
      return "/main/main";
    }else{
      throw new RuntimeException("계정 업써요");
    }
  }

}
