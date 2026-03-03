package com.ai_pricing_engine.api_gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI apiGatewayServiceAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Gateway Service API")
                        .description("Dynamic pricing microservice")
                        .version("v1.0"));
    }
}