CREATE TABLE pricing_decisions (
    id SERIAL PRIMARY KEY,
    user_id VARCHAR(50),
    product_id VARCHAR(50),
    base_price NUMERIC,
    final_price NUMERIC,
    confidence_score NUMERIC,
    explanation_json TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);