package Function_based_programs;

public class SumOfFactorial {
    public static int printSum(int n,int product,int sum) {
        for (int i=1; i<=n; i++){
            product = 1;
            for (int j=i; j>=1; j--){
                product *= j;
            }
            sum += product;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(printSum(n,1,0));
    }
}
