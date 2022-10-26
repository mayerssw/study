package kr.co.bzsys.study.conf;

//
//@EnableWebSecurity    // spring security 적용하는 annotation
//@RequiredArgsConstructor
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//  public SecurityFilterChain web(HttpSecurity http) throws Exception {
//    // @formatter:off
//    http
//        .authorizeHttpRequests((authorize) -> authorize
//            .antMatchers("/**").permitAll()
//            .anyRequest().hasRole("USER")
//        )
//        .formLogin((formLogin) ->
//            formLogin
//                .usernameParameter("username")
//                .passwordParameter("password")
////                .loginPage("/login")
////                .failureUrl("/login/loginDenied")
////                .loginProcessingUrl("/login/loginSuccess")
//        );
//
//    //@fornatter:on
//    return http.build();
//  }
//
//  public UserDetailsService userDetailsService(){
//    UserDetails user = User.withDefaultPasswordEncoder()
//        .username("user")
//        .password("password")
//        .roles("USER")
//        .build();
//    return new InMemoryUserDetailsManager(user);
//
//  }
//}

