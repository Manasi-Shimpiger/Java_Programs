package Recursion;
import java.sql.SQLOutput;
import java.util.*;

public class UniqueSunbsequence {
    public static void subsequence(String str,int index,String newString,HashSet<String>set) {
        if(index==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curChar=str.charAt(index);
        //to be
        subsequence(str,index+1,newString+curChar,set);
        //not to be
        subsequence(str,index+1,newString,set);
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        subsequence(str,0,"",set);
    }
}
