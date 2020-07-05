package com.saikiran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primitives {
    public static void main(){
        System.out.println("2nd code snippet");
        //create an integer Array
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println("Array Length: "+ arr1.length);
        // Print array
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] );
            System.out.print(" ");
        }

        //List<Integer> listFromArray = new ArrayList<Integer>(Arrays.asList(arr1));



        //Another way to initialize
        int[] arr2 = {41,21,31,14,115};
        System.out.printf("\nArray Length: %d \n", arr2.length);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] );
            System.out.print(" ");
        }
        SortingTechnique.insertionSort(arr2);
        System.out.printf("\nArray Length: %d \n", arr2.length);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] );
            System.out.print(" ");
        }
    }
}
