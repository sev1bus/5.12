package com.company;

public class Task6 {

    public static void main(String[] args) {
        int[][] a = new int[15][];
        a [0] = new int [5];
        a [1] = new int [5];
        a [2] = new int [5];
        a [3] = new int [5];
        a [4] = new int [8];
        a [5] = new int [8];
        a [6] = new int [8];
        a [7] = new int [8];
        a [8] = new int [3];
        a [9] = new int [3];
        a [10] = new int [3];
        a [11] = new int [3];
        a [12] = new int [9];
        a [13] = new int [9];
        a [14] = new int [9];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=(int)(Math.random()*15);
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}