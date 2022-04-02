package com.company;

public class Main {

    public static void main(String[] args) {
        int a=0;
        // i <= кількості елементів
        for(int i=1;i <=99;i++){
            if(i%2!=0)a++;
        }

        int[] Mas = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Mas[b]=i;
                System.out.println(Mas[b]+" ");
                b++;
            }
        }


    }
}

