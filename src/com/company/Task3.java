package com.company;

public class Task3 {
    public static void main(String[] args) {
        int ok1[] = new int[5];
        int ok2[] = new int[5];
        int ok3[] = new int[5];
        double mid1 = 0, mid2 = 0, mid3 = 0;
        for (int i = 0; i < 5; i++) {
            ok1[i] = (int) Math.round(Math.random() * 5);
            mid1 = mid1 + ok1[i];
            System.out.print(ok1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            ok2[i] = (int) Math.round(Math.random() * 5);
            mid2 = mid2 + ok2[i];
            System.out.print(ok2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            ok3[i] = (int) Math.round(Math.random() * 5);
            mid3 = mid3 + ok3[i];
            System.out.print(ok3[i] + " ");
        }
        System.out.println();
        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);
        if (mid1 < mid2)
            System.out.println("mid1<mid2");
        else if (mid1 > mid2)
            System.out.println("mid1>mid2");
        else if (mid1 == mid2)
            System.out.println("mid1==mid2");
            // 1 2

        else if (mid1 > mid3)
            System.out.println("mid1>mid3");
        else if (mid1 == mid3)
            System.out.println("mid1==mid3");
        else if (mid1 < mid3)
            System.out.println("mid1<mid3");
            //1 3

        else if (mid2 > mid3)
            System.out.println("mid2>mid3");
        else if (mid2 == mid3)
            System.out.println("mid2==mid3");
        else if (mid2 < mid3)
            System.out.println("mid2<mid3");
        //2 3
    }
}