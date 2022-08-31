package Searching_algorithm;

public class MinValueIn2DArray {
    public static void main(String[] args) {
        int a[][]={
                {2,5,3},
                {7,1,14},
                {11,9,4}
        };
        System.out.println(searchMin(a));
    }

    public static int searchMin(int a[][]) {
        if(a.length==0){
            System.out.println("Array is empty");
        }
        int min=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int element=a[i][j];
                if(min>element){
                    min=element;
                }
            }
        }
        return min;
    }
}
