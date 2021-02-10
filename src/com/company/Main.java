package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static int[] randomArray(int size) {
        int[] list = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list[i] = random.nextInt();
        }
        return list;
    }


    public static void main(String[] args) {
        int[] myDirtyArray = randomArray(20000);
        System.out.println(Arrays.toString(myDirtyArray));

        long startTime = System.currentTimeMillis();
        MergeSort.mergeSort(myDirtyArray, 0, myDirtyArray.length-1);
        Heapsort.printArray(myDirtyArray);
//        quickSort;
        System.out.println(Arrays.toString(myDirtyArray));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
