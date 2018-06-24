package com.ebaykorea.ecouponshop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebApplicationSecurity extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/script/**", "image/**", "/fonts/**", "lib/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http.authorizeRequests()
                  .antMatchers("/admin/**").hasRole("ADMIN")
                  .antMatchers("/").permitAll()
                  .antMatchers("/members/joinform").permitAll()
                  .antMatchers(HttpMethod.POST,"/members/join").permitAll()
                  .antMatchers("/members/welcome").permitAll()
                  .antMatchers("/members/login").permitAll()
                  .antMatchers("/members/**").hasRole("USER")
                  .antMatchers("/main/item").permitAll()
                  .antMatchers("/h2-console/**").permitAll()
                  .anyRequest().fullyAuthenticated()
                  .and()
                  .csrf().ignoringAntMatchers("/**")
                  .ignoringAntMatchers("h2-console/**");
    }
}
