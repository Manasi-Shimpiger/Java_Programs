package Recursion;
import java.util.ArrayList;

public class TwoArraysSortAndMerge {
    public static ArrayList<Integer> merge(int a[],int b[]){
        ArrayList<Integer> c = new ArrayList<>();
        for (int i=0;i<a.length;i++){
            for (int j = 0; j < b.length; j++) {
                if(a[i]<b[j]){
                    if(!c.contains(a[i])) {
                        c.add(a[i]);
                    }
                }else{
                    if(!c.contains(b[j])) {
                        c.add(b[j]);
                    }
                }
            }
        }
        c.add(b[b.length-1]);
        return c;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5};
        int b[] = {2,4,6};
        System.out.println(merge(a,b));
    }
}
