package Recursion;

public class MoveAllXAtLast {
    public static void moveX(String str,int index,int count,String NewString) {
        if(index==str.length()){
            for (int i=0; i<count; i++){
                NewString +='x';
            }
            System.out.println(NewString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            moveX(str,index+1,count,NewString);
        }else{
            NewString += currChar;
            moveX(str,index+1,count,NewString);
        }
    }

    public static void main(String[] args) {
        String str="axbxxcd";
        moveX(str,0,0,"");
    }
}
