package Function_based_programs;
import java.util.*;

public class SumOfOddNumbers {
    public static int printSum(int sum,int index,int n) {
        for(int i=1; i<=n; i+=2){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        System.out.print("Sum is: "+printSum(0,0,n));
    }
}
