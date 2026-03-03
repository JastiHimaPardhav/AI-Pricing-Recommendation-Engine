package com.ai_pricing_engine.api_gateway.health;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ApiGatewayEngineHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean engineUp = isApiGatewayEngineAvailable();

        if (engineUp) {
            return Health.up()
                    .withDetail("apiGatewayEngine", "Available")
                    .build();
        }
        return Health.down()
                .withDetail("apiGatewayEngine", "Unavailable")
                .build();
    }

    private boolean isApiGatewayEngineAvailable() {
        // later: Redis / DB / ML service check
        return true;
    }
}
