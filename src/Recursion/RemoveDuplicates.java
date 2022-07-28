package Recursion;

public class RemoveDuplicates {
    public static boolean map[]=new boolean[26];
    public static void removeDuplicates(String str,int index,String newString) {
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char curChar=str.charAt(index);
        if(map[curChar-'a']==true){
            removeDuplicates(str,index+1,newString);
        }else{
            newString+=curChar;
            map[curChar-'a']=true;
            removeDuplicates(str, index+1, newString);
        }
    }

    public static void main(String[] args) {
        String str="abbcccaad";
        removeDuplicates(str,0,"");
    }

}
