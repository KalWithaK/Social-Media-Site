package com.tts.TechTalentTwitter.configuraton;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication


@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {
    @Bean
    public BCryptPasswordEncoder passwordEncoder () {
        BCryptPasswordEncoder bCryptPasswordEncoder =
                new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
        
    }
    @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
    public class SpringBootLauncher {
    	}
}
