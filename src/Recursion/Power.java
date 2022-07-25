package Recursion;

public class Power {
    public static int printPower(int x,int n) {
        if(x==0)
            return 0;
        else if (n==0)
            return 1;
        return x*printPower(x,(n-1));
    }

    public static void main(String[] args) {
        int x,n;
        System.out.println(printPower(2,5));
    }
}
