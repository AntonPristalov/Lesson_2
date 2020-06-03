package ru.geekbrains.catch_the_drop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//1
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
             for (int i1 = 0; i < arr.length; i++) {
                System.out.println(i + "-" + arr[i]);
            }
        }
//2

       int[] arr = new int[8];
        System.out.println(" ");

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i * 3;
            System.out.print(+arr[i] + " ");
            System.out.println(" ");
        }

//3
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(" ");
            System.out.print(+arr[i] + " ");
        }

//4
        int a = 12;
        int [][] dubblemass = new int[a][a];
        for (int i = 0; i < dubblemass.length; i++){
            for (int j = 0; j < dubblemass.length; j++){
                if (i == j) {
                    dubblemass[i][j] = 1;
                }else if (i + j == a - 1){
                    dubblemass[i][j] = 1;
                    }
                }
            System.out.println(Arrays.toString(dubblemass[i]));
            }

//5




    }





}
