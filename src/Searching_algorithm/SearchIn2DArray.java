package Searching_algorithm;

import java.sql.SQLOutput;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int a[][]={
                {2,5,3},
                {7,1,0},
                {11,9,4}
        };
        System.out.println(search(a,2));
    }

    public static int[] search(int a[][],int target) {
        if(a.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<a.length;row++){
            for(int col=0;col<a[row].length;col++){
                if(a[row][col]==target){
                    System.out.print("Number is at index: ");
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
