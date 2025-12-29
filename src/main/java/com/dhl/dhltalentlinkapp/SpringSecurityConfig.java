package com.dhl.dhltalentlinkapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private AuthenticationEntryPoint authEntryPoint;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/getSDHExportDetails","/getMyHRExportDetails").authenticated().and()
				.httpBasic().authenticationEntryPoint(authEntryPoint);
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		String password = passwordEncoder.encode("H_rXitDqp5Ql");
		auth.inMemoryAuthentication().withUser("dhl").password(password).roles("USER");
	}

}
