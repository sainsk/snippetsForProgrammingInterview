package com.saikiran.algorithms;

class BinarySearch{

    static Integer binSearch(Integer[] arr, int low, int hi, Integer findVal){
        if(low < hi){
            mid = (low+hi)/2;
            if(arr[mid] > findVal ){
                return binSearch(arr, low, mid, findVal);
            }else if(arr[mid] == findVal ){
                return mid;
            }else{
                return binSearch(arr, mid, hi, findVal);
            }
        }else{
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //Initialize ArraySize
        Integer[] array = new Integer[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        Integer findVal = sc.nextInt();
        System.out.println(binSearch(arr, 0, size -1, findVal));
    }
}