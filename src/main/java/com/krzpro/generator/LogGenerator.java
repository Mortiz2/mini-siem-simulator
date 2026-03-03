package com.krzpro.generator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class LogGenerator {
    static Random random = new Random();
    public static List<String> generateLogs(int amount) {
        List<String> logs = new ArrayList<>();

        for (int count = 0; count < amount; ) {
            int chance = random.nextInt(100);

            if (chance < 5) {
                int denied = random.nextInt(7) + 3;
                String ip = IPGenerator.generateIP();
                for (int i = 0; i < denied; i++) {
                    Log log = new Log(ip, LocalDateTime.now(), Action.LOGIN, Status.FAILED);
                    logs.add(log.toString());
                    count++;
                }
                Log log = new Log(ip, LocalDateTime.now(), Action.LOGIN, Status.SUCCESS);
                logs.add(log.toString());
                count++;

            } else {
                logs.add(generateNormalLog());
                count++;
            }
        }
        return logs;
    }
    public static String generateNormalLog() {
        String ip = IPGenerator.generateIP();
        LocalDateTime time = LocalDateTime.now();
        Action action = Action.randomAction();
        Status status = Status.randomStatus();

        Log log = new Log(ip, time, action, status);
        return log.toString();
    }
}
