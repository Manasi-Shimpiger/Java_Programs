package Searching_algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={-2,0,4,6,8,0,20,25,29};
        int ans=search(a,25);
        System.out.println(ans);
    }
    public static int search(int a[],int target){
        int start=0;
        int end=a.length;
        while(start<=end){
            int mid=start+(end-start)/2;   //mid value might exceed limit,so using (end-start)
            if(target<a[mid]){
                end=mid-1;
            } else if (target>a[mid]) {
                start=mid+1;
            }else
                return mid;
        }
        return -1; //if element is not found return -1
    }
}

