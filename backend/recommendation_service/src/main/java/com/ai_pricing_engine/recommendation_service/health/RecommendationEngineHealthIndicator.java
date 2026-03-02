package com.ai_pricing_engine.recommendation_service.health;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RecommendationEngineHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean engineUp = isRecommendationEngineAvailable();

        if (engineUp) {
            return Health.up()
                    .withDetail("recommendationEngine", "Available")
                    .build();
        }
        return Health.down()
                .withDetail("recommendationEngine", "Unavailable")
                .build();
    }

    private boolean isRecommendationEngineAvailable() {
        // later: Redis / DB / ML service check
        return true;
    }
}
