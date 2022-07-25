package Recursion;

public class Fibonacci {
    public static void PrintFib(int a,int b, int n) {
        if(n==0)
            return;
        int c =a+b;
        System.out.print(c+" ");
        PrintFib(b,c,n-1);
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=8;
        System.out.print(a+" ");
        System.out.print(b+" ");
        PrintFib(a,b,n-2);
    }
}
