package kr.co.bzsys.study.mapper.login;

import kr.co.bzsys.study.dto.login.LoginDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

  LoginDto chkLoginUser(@Param("userId") String userId);

}
