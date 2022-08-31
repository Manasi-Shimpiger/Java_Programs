package Searching_algorithm;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int a[]={2,7,5,-3,10,-2,8};
        System.out.println(maximumNumber(a));
    }
    public static int maximumNumber(int a[]) {
        if(a.length==0){
            System.out.println("Array is empty");
        }
        int n=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>n){
                n=a[i];
            }
        }
        return n;
    }
}
