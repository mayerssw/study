package kr.co.bzsys.study.service;

import kr.co.bzsys.study.dto.login.LoginDto;

public interface LoginService {

  LoginDto chkLoginUser(String userId);

}
