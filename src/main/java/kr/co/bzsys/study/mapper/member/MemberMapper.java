package kr.co.bzsys.study.mapper.member;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

  int addMember(@Param("userId") String userId, @Param("password") String password, @Param("userName") String userName );
  //회원가입


}
