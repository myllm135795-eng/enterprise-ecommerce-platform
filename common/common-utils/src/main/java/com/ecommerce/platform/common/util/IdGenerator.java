package com.ecommerce.platform.common.util;

import java.util.UUID;

public class IdGenerator {
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    public static String generateOrderId() {
        return "ORD-" + System.currentTimeMillis() + "-" + generateRandomSuffix();
    }

    public static String generatePaymentId() {
        return "PAY-" + System.currentTimeMillis() + "-" + generateRandomSuffix();
    }

    public static String generateShippingId() {
        return "SHIP-" + System.currentTimeMillis() + "-" + generateRandomSuffix();
    }

    private static String generateRandomSuffix() {
        return String.format("%04d", (int) (Math.random() * 10000));
    }
}
