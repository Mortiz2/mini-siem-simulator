package com.krzpro.generator;

import java.util.Random;

public enum Action {
    LOGIN, LOGOUT, FILE_ACCESS;

    private static final Random random = new Random();

    public static Action randomAction() {
        Action[] actions = values();
        return actions[random.nextInt(actions.length)];
    }

}
