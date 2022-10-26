package kr.co.bzsys.study.service;

import java.util.List;
import kr.co.bzsys.study.dto.login.LoginDto;
import kr.co.bzsys.study.mapper.login.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

  @Autowired
  LoginMapper loginMapper;

  @Override
  public boolean chkLoginUser(String userId, String password) {
    int cnt;
    cnt = loginMapper.chkLoginUser(userId, password);
    return cnt > 0;
  }

  public List<LoginDto> selectLoginUser(String userId) {
    return loginMapper.selectLoginUser(userId);
  }

}
