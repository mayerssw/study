package kr.co.bzsys.study.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@RequiredArgsConstructor
@EnableWebSecurity    // spring security 적용하는 annotation
@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    // @formatter:off
    http.csrf().disable();
    http.authorizeRequests()
        .antMatchers("/**").permitAll()
        .and()
        .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/loginSuccess")
                .failureUrl("/loginDenied")
        .and()
          .logout()
          .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
          .logoutSuccessUrl("/login")
          .invalidateHttpSession(true);
    return http.build();
  }

  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
    }

  @Bean
  public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationManager) throws Exception{
    return authenticationManager.getAuthenticationManager();
    }

}

