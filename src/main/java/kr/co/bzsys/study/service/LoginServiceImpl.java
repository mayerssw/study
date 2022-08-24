package kr.co.bzsys.study.service;

import kr.co.bzsys.study.mapper.login.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  LoginMapper loginMapper;

  @Override
  public boolean selectLoginUser(String userId, String password) {
    int cnt;
    cnt = loginMapper.selectLoginUser(userId, password);
    if (cnt > 0) {
      return true;
    } else {
      return false;
    }
  }

}
