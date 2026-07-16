package com.ecommerce.platform.common.util;

import java.util.UUID;

public class CorrelationIdUtil {
    private static final ThreadLocal<String> correlationId = new ThreadLocal<>();

    public static String getCorrelationId() {
        String id = correlationId.get();
        if (id == null) {
            id = generateCorrelationId();
            setCorrelationId(id);
        }
        return id;
    }

    public static void setCorrelationId(String id) {
        correlationId.set(id);
    }

    public static String generateCorrelationId() {
        return UUID.randomUUID().toString();
    }

    public static void clear() {
        correlationId.remove();
    }
}
