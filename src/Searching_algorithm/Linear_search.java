package Searching_algorithm;

public class Linear_search {
    public static void main(String[] args) {
        int a[]={15,2,9,0,25,16,20};
        System.out.println(Search(a,16));
    }
    public static int Search(int a[],int target){
        if(a.length==0){
            System.out.println("Array is empty");
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                System.out.print("Target value is at index: ");
                return i;
            }
        }
        System.out.println("No value found");
        return -1;
    }
}
