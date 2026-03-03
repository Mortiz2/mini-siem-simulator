package com.krzpro;

import com.krzpro.generator.IPGenerator;
import com.krzpro.generator.LogGenerator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            String log = LogGenerator.generateRandLog();
            System.out.println(log);
        }
    }
}