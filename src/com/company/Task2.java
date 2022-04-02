package com.company;

public class Task2 {

    public static void main(String[] args) {

        int ok1[] = new int[20];
        int ok2[] = new int[20];
        for (int i = 0; i < 20; i++) {
            ok1[i] = (int) Math.round(Math.random() * 9);
            System.out.print("1)" + ok1[i] + ", ");
            ok2[i] = ok1[i];


            if (ok1[i] % 2 != 0) {
                ok2[i] = ok2[i] * 0;
            }
            System.out.println("2)" + ok2[i] + ", ");


        }
    }
}
