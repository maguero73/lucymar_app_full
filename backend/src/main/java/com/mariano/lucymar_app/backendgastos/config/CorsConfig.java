    package com.mariano.lucymar_app.backendgastos.config;
    
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
                    registry.addMapping("/api/**") // ruta de tu controlador
                            .allowedOriginPatterns("http://localhost:8081") // front docker
                            .allowedOriginPatterns("http://localhost:8083") // frontend local
                            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                            .allowedHeaders("*")
                            .allowCredentials(false); // si vas a usar cookies o auth headers
                }
            };
        }
    }
