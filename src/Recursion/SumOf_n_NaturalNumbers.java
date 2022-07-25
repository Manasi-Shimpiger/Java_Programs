package Recursion;

public class SumOf_n_NaturalNumbers {
    public static void Sum(int i, int n, int sum) {
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Sum(i+1, n,sum);
    }

    public static void main(String[] args) {
        Sum(0,5,0);
    }
}
