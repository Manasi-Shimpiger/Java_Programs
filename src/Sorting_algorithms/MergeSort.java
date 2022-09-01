package Sorting_algorithms;

public class MergeSort {
    public static void conqure(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x=0;

        while(indx1<=mid && indx2<=ei){
            if(a[indx1]<a[indx2]){
                temp[x]=a[indx1];
                x++;
                indx1++;
            }else{
                temp[x]=a[indx2];
                x++;
                indx2++;
            }
        }
        while(indx1<=mid){
            temp[x]=a[indx1];
            x++;
            indx1++;
        }
        while(indx2<=ei){
            temp[x]=a[indx2];
            x++;
            indx2++;
        }
        //copying all the values from temp to a[]
        for(int i=0, j=si;i< temp.length;i++, j++){
            a[j]=temp[i];
        }

    }
    public static void divide(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+(ei-si)/2);
        divide(a, si, mid);
        divide(a, mid+1, ei);
        conqure(a,si,mid,ei);
    }
    public static void main(String[] args) {
        int a[]={6,4,8,3,5,9,0};
        int n=a.length;
        divide(a,0,n-1);

        //printing
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
