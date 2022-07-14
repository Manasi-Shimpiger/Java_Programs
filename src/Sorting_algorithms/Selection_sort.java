package Sorting_algorithms;

import java.net.SocketOption;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        for(int i=0; i< arr.length-1; i++){
            int smallest=i;
            for(int j= i+1; j< arr.length; j++ ){
                if(arr[smallest] > arr[j]){
                    int temp;
                    temp = arr[smallest];
                    arr[smallest] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
