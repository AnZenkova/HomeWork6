package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int [] dailyExpenses = new int [30];
        for (int i = 0; i < 30; i++) {
            Random a = new Random();
            int b = a.nextInt(100_000) + 100_000;
            dailyExpenses [i] = b;
            System.out.println(dailyExpenses[i]);
        }
        int sumExpenses = 0;
        for (int dailyExpens : dailyExpenses) {
            sumExpenses = sumExpenses + dailyExpens;
        }
        System.out.println("Сумма трат за месяц составила " + sumExpenses + " рублей");
        int maxExpens = -1;
        for (int dailyExpens : dailyExpenses) {
            if (dailyExpens > maxExpens) {
                maxExpens = dailyExpens;
            }
        }
        int minExpenses = maxExpens;
        for (int dailyExpens : dailyExpenses) {
            if (minExpenses > dailyExpens) {
                minExpenses = dailyExpens;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpens + " рублей»");
        int maxIndexLength = dailyExpenses.length;
        double averageExpenses = sumExpenses / maxIndexLength;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int lastIndex = reverseFullName.length -1;
        int numberCycles = reverseFullName.length/2;
        for (int i = 0; i < numberCycles; i++) {
            char memory = reverseFullName[i];
            reverseFullName[i]=reverseFullName[lastIndex];
            reverseFullName[lastIndex] = memory;
            lastIndex=lastIndex - 1;
        }
        System.out.println(reverseFullName);
    }
}
