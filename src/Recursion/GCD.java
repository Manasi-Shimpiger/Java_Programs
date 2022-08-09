package Recursion;
import java.util.Scanner;

public class GCD {
    public static int gcd(int n1,int n2) {
        if(n2==0)
            return n1;
        return gcd(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans = gcd(n1,n2);
        System.out.println("GCD of "+n1+" and "+n2+" is "+ans);
    }
}
