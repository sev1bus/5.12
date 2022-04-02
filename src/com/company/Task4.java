package com.company;

public class Task4 {
    public static void main(String[] args) {
        int ok1[] = new int[10];
        int ok2[] = new int[10];
        int ok3[] = new int[10];

        for (int i = 0; i < 10; i++) {

            ok1[i] = (int) Math.round(Math.random() * 10);

            System.out.println("Перший елемент: "+ok1[i]);

            ok2[i] = (int) Math.round(Math.random() * 10);
            System.out.println("Другий елемент: " + ok2[i]);
            ok3[i] = ok2[i] + ok1[i];

            System.out.println("Сума: " + ok3[i]);
        }

    }
}