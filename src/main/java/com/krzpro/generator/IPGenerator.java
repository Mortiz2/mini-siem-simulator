package com.krzpro.generator;

import java.util.Random;

public class IPGenerator {
    public static String generateIP() {
        Random random = new Random();
        return random.nextInt(256) + "." +
                random.nextInt(256) + "." +
                random.nextInt(256) + "." +
                random.nextInt(256);
    }
}