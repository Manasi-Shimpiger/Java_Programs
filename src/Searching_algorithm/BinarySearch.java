package Searching_algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={-2,0,4,6,8};
        int ans=search(a,4);
        System.out.println(ans);
    }
    public static int search(int a[],int target){
        int start=0;
        int end=a.length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;//mid value might exceed limit,so using (end-start)

                if(target==a[mid]){
                    return mid;
                }
                //if array is sorted in ascending order
                if(a[start]<a[end]){
                    if (target < a[mid]) {
                        end = mid - 1;
                    } else if (target > a[mid]) {
                        start = mid + 1;
                    }
                }
                //if array is sorted in descending order
                else if (a[start]>a[end]) {
                    if (target < a[mid]) {
                        start = mid + 1;
                    } else if (target > a[mid]) {
                        end = mid - 1;
                    }
                }
            }
        return -1; //if element is not found return -1
    }

}

