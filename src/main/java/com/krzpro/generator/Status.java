package com.krzpro.generator;

import java.util.Random;

public enum Status {
    SUCCESS, FAILED;

    private static final Random random = new Random();

    public static Status randomStatus() {
        Status[] statuses = values();
        return statuses[random.nextInt(statuses.length)];
    }

}
