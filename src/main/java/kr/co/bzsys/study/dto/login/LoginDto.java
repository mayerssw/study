package kr.co.bzsys.study.dto.login;

import lombok.Data;

@Data
public class LoginDto {

  private String userId;
  private String password;
  private String name;

//  @Override public Collection<? extends GrantedAuthority> getAuthorities() {
//    return Collections.singletonList(new SimpleGrantedAuthority(this.userAuth));
//  }
//
//  @Override public String getUsername() {
//    return this.userId;
//  }
//
//  @Override public boolean isAccountNonExpired() {
//    return true;
//  }
//
//  @Override public boolean isAccountNonLocked() {
//    return true;
//  }
//
//  @Override public boolean isCredentialsNonExpired() {
//    return true;
//  }
//
//  @Override public boolean isEnabled() {
//    return true;
//  }

}
