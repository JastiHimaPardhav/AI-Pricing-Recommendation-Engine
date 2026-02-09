package com.ai_pricing_engine.feature_store_service.health;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class FeatureStoreEngineHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean engineUp = isFeatureStoreEngineAvailable();

        if (engineUp) {
            return Health.up()
                    .withDetail("featureStoreEngine", "Available")
                    .build();
        }
        return Health.down()
                .withDetail("featureStoreEngine", "Unavailable")
                .build();
    }

    private boolean isFeatureStoreEngineAvailable() {
        // later: Redis / DB / ML service check
        return true;
    }
}
