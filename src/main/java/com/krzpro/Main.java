package com.krzpro;

import com.krzpro.generator.IPGenerator;
import com.krzpro.generator.LogGenerator;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();

        logs = LogGenerator.generateLogs(100);

        for (String log : logs) {
            System.out.println(log);
        }
    }
}