package io.houni.authapp;

import java.util.UUID;

/**
 * @author Hamza Ouni
 */
public class Util {

    /**
     * Returns true if a value is true. Useful for method references
     */
    public static Boolean isTrue(Boolean value) {
        return value;
    }

    /**
     * Generate a random UUID
     */
    public static String generateRandomUuid() {
        return UUID.randomUUID().toString();
    }
}
