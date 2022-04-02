package com.company;

public class Task5 {

    public static void main(String[] args) {
        int a = 0;
        int ok1[] = new int[15];

        for (int i = 0; i < 15; i++) {
            ok1[i] = (int) Math.round(Math.random() * 10);
            System.out.println(ok1[i]);

            if (ok1[i] % 2 == 0) {
                a++;
            }
        }
        System.out.print("Кількість парних чисел: "+a);

    }
}
