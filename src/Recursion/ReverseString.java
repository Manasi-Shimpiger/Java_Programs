package Recursion;
import java.util.*;

public class ReverseString {
    public static void printString(String str, int index) {
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printString(str,index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= sc.next();
        System.out.print("After reversing: ");
        printString(str,str.length()-1);
    }
}
