package Searching_algorithm;

public class LinearSearchInString {
    public static void main(String[] args) {
        String str="Manasi";
        char target='n';
        System.out.println(searchChar(str,target));
    }

    public static int searchChar(String str, char target) {
        if(str.length()==0){
            System.out.println("String is empty");
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                System.out.println("Character is at index: "+i);
            }
        }
        return 0;
    }
}
