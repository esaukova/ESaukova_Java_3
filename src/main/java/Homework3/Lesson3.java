package Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        changeNumber(); //1
        fillUpArray();  //2
        multiplyByTwo();//3
        fillDiagonal(); //4
        System.out.println(Arrays.toString(intToArray(5, 10)));//5
        maxMin();       //6
    }
//ex.1
    public static void changeNumber() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
            System.out.println(arr[i]);
        }
    }

//ex.2
    public static void fillUpArray() {
        int [] arr = new int[101];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+1;
            System.out.println(arr[i]);
        }

    }

//ex.3
     public static void multiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < 6)
                 arr[i] = arr[i] * 2;
             System.out.print(arr[i] + " ");
         }
     }

//ex.4
     public static void fillDiagonal() {
        String format = "";
        int[][] arrD = new int [5][5];
         for (int i = 0; i < 5; i++) {
             for (int j = 0; j < 5; j++) {
                 if (i == j) {
                     arrD[i][j] = 1;
                 } else {
                     arrD[i][j] = 0;
                 }
                 System.out.print(arrD[i][j]);
             }
             System.out.println();
         }
}

//ex.5
      public static int[] intToArray (int len, int InV) {
          int size = len;
          int[] arr = new int[size];
          for (int i = 0; i < size; i++) {
             arr[i] = InV;
          }
          return arr;
    }

//ex.6
       public static void maxMin() {
        int[] arr = {1, 2, 3, 9, 7, 4, 3};
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
           for (int i = 0; i < arr.length; i++) {
              if (arr[i] < minVal) {
                  minVal = arr[i];
              }
           }
           System.out.println("Min.value" + minVal);
           for (int i = 0; i < arr.length; i++) {
               if (arr[i] > maxVal) {
                   maxVal = arr[i];
               }

           }
           System.out.println("Max.value" + maxVal);

}
}


