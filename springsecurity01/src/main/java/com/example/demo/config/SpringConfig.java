package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringConfig {
	@Bean
	public UserDetailsService userDetailsService()
	{
//		UserDetails user=User.withUsername("user")
//				.password("{noop}userPassword")
//				.build();
//		UserDetails admin=User.withUsername("admin")
//				.password("{noop}adminPassword")
//				.build();
		UserDetails user=User.withUsername("user")
				.password(passwordEncoder().encode("userPassword"))
				.roles("USER")
				.build();
		UserDetails admin=User.withUsername("admin")
				.password(passwordEncoder().encode("adminPassword"))
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user,admin);
	}
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception
	{
	    return http
	    		.csrf(AbstractHttpConfigurer::disable)
	    		.authorizeHttpRequests(auth->auth
	    				.requestMatchers("/admin/**").hasRole("ADMIN")
	    				.requestMatchers("/user/**").hasRole("USER")
	    				.requestMatchers("/test/**").permitAll()
	    				.anyRequest().authenticated()
	    				)
	    		.httpBasic(Customizer.withDefaults())
	    		.build();	
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}

}
