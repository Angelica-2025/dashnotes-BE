package dev.rosa.dashnotes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // permitir todas las rutas
                        .allowedOrigins("http://localhost:5173") // permitir peticiones desde tu React
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // permitir métodos
                        .allowedHeaders("*");
            }
        };
    }
}
