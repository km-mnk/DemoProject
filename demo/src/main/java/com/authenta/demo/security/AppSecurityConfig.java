package com.authenta.demo.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
class AppSecurityConfig {

    @Autowired
    PasswordEncoder pencoder;

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        
        UserDetails user = User.builder()
                .username("maldanna")
                .password(pencoder.encode("maldanna"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }


    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
        .antMatchers("/getToken").permitAll()
        .antMatchers("/getAllUsers").hasRole("Admin")
        .antMatchers("/signup/").permitAll()
        .antMatchers("/getuser/{Id}").permitAll();
        return http.build();

    }



}