package com.ai_pricing_engine.pricing_service.health;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class PricingEngineHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean engineUp = isPricingEngineAvailable();

        if (engineUp) {
            return Health.up()
                    .withDetail("pricingEngine", "Available")
                    .build();
        }
        return Health.down()
                .withDetail("pricingEngine", "Unavailable")
                .build();
    }

    private boolean isPricingEngineAvailable() {
        // later: Redis / DB / ML service check
        return true;
    }
}
