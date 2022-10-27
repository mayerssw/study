package kr.co.bzsys.study.controller.join;

import kr.co.bzsys.study.dto.MemberDto;
import kr.co.bzsys.study.service.InsertMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class JoinController {

  @Autowired
  InsertMemberService insertMemberService;

  @GetMapping("/moveJoin")
  public String moveJoin() {

    System.out.println("회원가입 페이지 이동");

    return "join/insertJoin";
  }

  @PostMapping("/insertJoin")
  public String insertJoin(MemberDto memberDto) throws Exception {

    String userId = memberDto.getUserId();
    String password = memberDto.getPassword();
    String userName = memberDto.getUserName();

    System.out.println(userId);
    System.out.println(password);
    System.out.println(userName);


    boolean result = insertMemberService.insertMember(userId, password, userName);
    if(result) {
      return "index";
    }else {
      throw new RuntimeException("계정 업써요");
    }

  }

}
