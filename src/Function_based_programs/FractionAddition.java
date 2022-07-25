package Function_based_programs;

public class FractionAddition {
    public static float calSum(int n,float sum) {
        for (int i=1;i<=n;i++){
            sum += i;
        }
        return sum/2;
    }

    public static void main(String[] args) {
        System.out.println("Sum: "+ calSum(2,0));
    }
}
