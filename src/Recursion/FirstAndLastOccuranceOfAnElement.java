package Recursion;

//Time complexity O(n); n=str.length
public class FirstAndLastOccuranceOfAnElement {
    public static int first=-1;
    public static int last=-1;

    public static void elementOccurance(String str,int index,char element) {
        if(index==str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentElement=str.charAt(index);
        if(currentElement==element){
            if(first==-1){
                first=index;
            } else{
                last=index;
            }

        }
        elementOccurance(str,index+1,element);
    }

    public static void main(String[] args) {
        String str="Mansishimpiger";
        elementOccurance(str,0,'s');
    }

}
