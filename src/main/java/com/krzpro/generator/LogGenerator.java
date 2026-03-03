package com.krzpro.generator;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

public class LogGenerator {
    public static String generateRandLog() {

        String ip = IPGenerator.generateIP();
        LocalDateTime time = LocalDateTime.now();
        Action action = Action.randomAction();
        Status status = Status.randomStatus();

        Log log = new Log(ip, time, action, status);
        return log.toString();
    }
}
