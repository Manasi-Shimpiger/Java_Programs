package Function_based_programs;
import java.util.*;

public class Factorial {
    public static int fact(int n) {
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial is: " + fact(n));
    }
}
