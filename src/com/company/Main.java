package com.company;

import java.util.Arrays;
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

        int [][] arrOne = new int [3][3];
        int a = arrOne.length - 1;
        int b = 0;
        for (int i = 0; i < arrOne.length; i++) {
            arrOne [i][i]= 1;
            b = Math.abs(i - a);
                    arrOne[i][b] = 1;
                    arrOne[b][i] = 1;
            }
        for (int i = 0; i < arrOne.length; i++) {
            for (int j = 0; j < arrOne.length; j++) {
                System.out.print(arrOne[i][j] + " ");
            }
            System.out.println();
        }
        int [] arrTwo = {5,4,3,2,1};
        System.out.println(Arrays.toString(arrTwo));
        int c = arrTwo.length;
        int [] arrTwoNew = new int[arrTwo.length];
        for (int i = 0; i < arrTwo.length; i++) {
            c = c - 1;
            arrTwoNew [i] = arrTwo[c];
        }
        System.out.println(Arrays.toString(arrTwoNew));
        int d = arrTwo.length -1;
        int numberCyclesTwo = arrTwo.length/2;
        for (int i = 0; i < numberCyclesTwo; i++) {
            int memory = arrTwo[i];
            arrTwo[i] = arrTwo[d];
            arrTwo[d] = memory;
            d = d - 1;
        }
        System.out.println(Arrays.toString(arrTwoNew));
        int [] arrThree = {-6,2,5,-8,8,10,4,-7,12,1};
        for (int i = 0; i < arrThree.length; i++) {
            for (int j = 0; j < arrThree.length; j++) {
                int z = arrThree [i] + arrThree [j];
                if (z == -2 && arrThree [i] != arrThree [j]) {
                    System.out.println(arrThree [i] + " " + arrThree [j]);
                    break;
                }
            }
            break;
        }
    }
}
