package kr.co.bzsys.study.controller.join;

import kr.co.bzsys.study.dto.member.MemberDto;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class JoinController {


  @GetMapping("/insertJoin")
  public String insertMember() {

    return "join/insertJoin.html";
  }

  @PostMapping("/userJoin")
  public String userJoin() {

    return "/";
  }




}
