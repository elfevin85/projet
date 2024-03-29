package com.example.projet2.Config;

import com.example.projet2.Security.UserPrincipalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

   @Bean
    AuthenticationProvider authenticationProvider(){
       DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
       provider.setUserDetailsService(userDetailsService);
       provider.setPasswordEncoder(new BCryptPasswordEncoder());
       return provider;
   }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/inscription").permitAll()
                .anyRequest().authenticated() // config bloc des ressources et urls
                .and() //fin de la configuration des ressources
                .formLogin()
                .defaultSuccessUrl("/coach", true)
                .and().logout();
    }
}
