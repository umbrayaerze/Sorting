package com.company;

import java.util.Random;

public class generateRandomNr {

    public static void main(String[] args) {
           Random rd = new Random();
           int[] arr = new int[20000];
           for (int i = 0; i < arr.length; i++) {
           arr[i] = getRandomNumberUsingNextInt(-20000, 20000);
           System.out.println(arr[i]);
        }
    }
    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static int [] getArray() {
        int[] arr = new int[20000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumberUsingNextInt(-20000, 20000);
        }
        return arr;
    }


}
