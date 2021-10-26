package com.vaishnavi.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ApplicationManager {
        @Bean(name="player")
        public Player createPlayer()
        {
        	return new Player();
        }
}
