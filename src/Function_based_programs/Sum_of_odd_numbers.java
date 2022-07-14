package Function_based_programs;
import java.util.*;

public class Sum_of_odd_numbers {
    public static int main(int n) {
        int sum=0;
        for(int i=1; i<=n; i+=2){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
    }
}
