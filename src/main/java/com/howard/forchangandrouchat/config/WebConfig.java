package com.howard.forchangandrouchat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {

        // 針對此專案提供的的所有 API 路徑開啟 CORS
        registry.addMapping("/**")
                // 設定要允許非同源請求的網域
                .allowedOrigins("https://forchangandrouchatfrontend.storage.googleapis.com")
                // 設定要允許該網域的哪些請求，星號代表允許所有請求類型，若要特別指定就寫 GET 或 POST ...
                .allowedMethods("*")
                // 允許前端帶上任意的請求標頭
                .allowedHeaders("*")
                // 允許前端帶上憑證訊息，像是 cookie、http 憑證... 等
                .allowCredentials(true);

    }

}
