package com.rai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Custom configuration for security

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((requests) ->
                requests.requestMatchers("/myBalance", "/myAccount", "/myLoan", "/myCards", "/user", "/admin", "/user").authenticated()
                        .requestMatchers("/notice", "/contact", "/public").permitAll());
        httpSecurity.formLogin(withDefaults());
        httpSecurity.httpBasic(withDefaults());
        return httpSecurity.build();
    }

    // Denying all Request configuration
   /*
   @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests)->
                requests.anyRequest().denyAll());
                http.formLogin(withDefaults());
                http.httpBasic(withDefaults());
        return http.build();

    }*/

    // Accepting any request
    /*
    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests)->
                requests.anyRequest().permitAll();
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();

}*/
}
