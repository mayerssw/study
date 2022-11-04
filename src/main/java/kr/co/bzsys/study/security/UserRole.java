package kr.co.bzsys.study.security;

import lombok.Getter;

@Getter
public enum UserRole {
  ADMIN("ROLE_ADMIN"),
  USER("ROLE_USER");

  UserRole(String value) {
    this.value = value;
  }

  private final String value;

}
