package kr.co.bzsys.study.mapper.login;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

  int selectLoginUser(@Param("userId") String userId, @Param("password") String password);

}
