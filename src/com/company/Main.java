package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] dailyExpenses = new int [30];
        for (int i = 0; i < 30; i++) {
            Random a = new Random();
            int b = a.nextInt(100_000) + 100_000;
            dailyExpenses [i] = b;
        }
        int sumExpenses = 0;
        for (int dailyExpens : dailyExpenses) {
            sumExpenses = sumExpenses + dailyExpens;
        }
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей");
    }
}
