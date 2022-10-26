package kr.co.bzsys.study.service;

import java.util.List;
import kr.co.bzsys.study.dto.login.LoginDto;

public interface LoginService {

  boolean chkLoginUser(String userId, String password);

  List<LoginDto> selectLoginUser(String userId);

}
