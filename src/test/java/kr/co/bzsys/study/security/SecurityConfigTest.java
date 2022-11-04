package kr.co.bzsys.study.security;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class SecurityConfigTest {

  @Test
  void passwordEncoder() {
    BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
    System.out.println(bcrypt.encode("leehyun"));
  }

}