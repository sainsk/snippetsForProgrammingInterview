package com.saikiran;

public class SortingTechnique {
    public static int[] insertionSort(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            int j = i;
            while (j > 0 && (inputArray[j] < inputArray[j - 1])) {
                int temp = inputArray[j];
                inputArray[j] = inputArray[j - 1];
                inputArray[j - 1] = temp;
                j--;
            }
        }
        return inputArray;
    }

}
