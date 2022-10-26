package kr.co.bzsys.study.mapper.login;

import java.util.List;
import kr.co.bzsys.study.dto.login.LoginDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

  int chkLoginUser(@Param("userId") String userId, @Param("password") String password);

  List<LoginDto> selectLoginUser(@Param("userId") String userId);

}
