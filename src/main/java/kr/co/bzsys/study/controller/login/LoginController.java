package kr.co.bzsys.study.controller.login;

import java.util.List;
import kr.co.bzsys.study.dto.login.LoginDto;
import kr.co.bzsys.study.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class LoginController {

  @Autowired
  LoginService loginService;

  @RequestMapping(value = "/login")
  public String selectLoginUser(LoginDto loginDto, Model model) {

    String userId = loginDto.getUserId();
    String password = loginDto.getPassword();
    boolean result = loginService.chkLoginUser(userId, password);

    List<LoginDto> selUsers;
    selUsers = loginService.selectLoginUser(userId);
    String name = selUsers.get(0).getName();

    model.addAttribute("userId", userId);
    model.addAttribute("name", name);

    if (result) {
      return "/main/main";
    } else {
      return "/login/loginDenied";
    }
  }

}
