package kr.co.bzsys.study.service;

import org.springframework.stereotype.Service;

@Service
public interface InsertMemberService {

  boolean insertMember(String userId, String password, String userName);


}
