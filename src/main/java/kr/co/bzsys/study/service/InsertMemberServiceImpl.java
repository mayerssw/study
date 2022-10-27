package kr.co.bzsys.study.service;

import kr.co.bzsys.study.mapper.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertMemberServiceImpl implements InsertMemberService {

  @Autowired
  MemberMapper memberMapper;

  @Override
  public boolean insertMember(String userId, String password, String userName) {

    int cnt;
    cnt = memberMapper.insertMember(userId, password, userName);
    if (cnt > 0) {
      return true;
    } else {
      throw new RuntimeException("회원가입 저장 실패!");
    }
  }

}
