package kr.co.bzsys.study.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kr.co.bzsys.study.dto.login.LoginDto;
import kr.co.bzsys.study.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSecurityService implements UserDetailsService {

  private final LoginService loginService;

  @Override
  public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
    Optional<LoginDto> _siteUser = Optional.ofNullable(loginService.chkLoginUser(name));
    if (_siteUser.isEmpty()) {
      throw new UsernameNotFoundException("사용자를 찾을 수 없습니다");
    }
    LoginDto loginDto = _siteUser.get();
    List<GrantedAuthority> autorities = new ArrayList<>();
    if ("admin".equals(name)) {
      autorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
    } else {
      autorities.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
    }
    return new User(loginDto.getName(), loginDto.getPassword(), autorities);
  }

}
