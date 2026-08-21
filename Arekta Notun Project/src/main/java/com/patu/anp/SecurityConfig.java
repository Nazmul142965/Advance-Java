package com.patu.anp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filter(HttpSecurity http){
        http.authorizeHttpRequests(request -> request
                        .requestMatchers("/sign-up","/privacy-policy").permitAll()
                        .requestMatchers("/admin/**").denyAll()
                        .requestMatchers("/payments-*").fullyAuthenticated()
                        .anyRequest().authenticated())
                        .formLogin(form ->  form.loginPage("/sign-in")
                                .permitAll())
                        .formLogin(Customizer.withDefaults())
                        .logout(Customizer.withDefaults())
                        .rememberMe(Customizer.withDefaults());
        return http.build();
    }

}
