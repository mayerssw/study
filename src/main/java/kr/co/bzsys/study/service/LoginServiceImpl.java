package kr.co.bzsys.study.service;

import kr.co.bzsys.study.dto.login.LoginDto;
import kr.co.bzsys.study.mapper.login.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  LoginMapper loginMapper;

  @Override
  public LoginDto chkLoginUser(String userId) {
    return loginMapper.chkLoginUser(userId);
  }

}
