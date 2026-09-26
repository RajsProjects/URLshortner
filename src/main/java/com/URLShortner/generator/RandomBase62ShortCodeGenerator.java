package com.URLShortner.generator;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.security.SecureRandom;

@Component
public class RandomBase62ShortCodeGenerator implements ShortCodeGenerator {

    private static final String ALPHABET =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static final BigInteger BASE = BigInteger.valueOf(62);

    private final SecureRandom random = new SecureRandom();

    @Override
    public String generate() {
        byte[] bytes = new byte[8];
        random.nextBytes(bytes);

        BigInteger value = new BigInteger(1, bytes);

        if (value.equals(BigInteger.ZERO)) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (value.compareTo(BigInteger.ZERO) > 0) {
            BigInteger remainder = value.mod(BASE);
            int index = remainder.intValue();

            result.append(ALPHABET.charAt(index));

            value = value.divide(BASE);
        }

        return result.reverse().toString();
    }
}