package kr.co.bzsys.study.controller.join;

import kr.co.bzsys.study.dto.MemberDto;
import kr.co.bzsys.study.service.InsertMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class JoinController {

  @Autowired
  InsertMemberService insertMemberService;

  @GetMapping("/moveJoin")
  public String moveJoin() {
    return "join/insertJoin";
  }

  @RequestMapping("/insertJoin")
  public String insertJoin(MemberDto memberDto) throws Exception {
    BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder(); // springSecurity password encode
    String userId = memberDto.getUserId();
    String password = bcrypt.encode(memberDto.getPassword());
    String userName = memberDto.getUserName();

    boolean result = insertMemberService.insertMember(userId, password, userName);
    if (result) {
      return "index";
    } else {
      throw new RuntimeException("계정 업써요");
    }
  }

}
