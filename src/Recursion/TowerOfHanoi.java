package Recursion;
import java.util.*;

public class TowerOfHanoi {
    public static void tower_of_hanoi(int n, String src,String helper, String dest) {
        if(n==1) {
            System.out.println(n + " transferred from " + src + " to" + dest);
            return;
        }
        tower_of_hanoi((n-1),src,dest,helper);
        System.out.println(n+ " transferred from "+src+" to"+dest);
        tower_of_hanoi((n-1),helper,src,dest);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of disks:");
        int n = sc.nextInt();
        tower_of_hanoi(n,"S","H","D");

    }
}
