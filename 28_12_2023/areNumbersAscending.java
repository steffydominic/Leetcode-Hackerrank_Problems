

public class areNumbersAscending {
public static void main(String[] args) {
    
String s="hello world 5 x 5";
    String[] arr= s.split(" ");
        int x =-1;
        for(var str: arr){
            if(Character.isDigit(str.charAt(0))){
                if(x < Integer.parseInt(str)){
                    x= Integer.parseInt(str);
                }else{
                   System.out.println("false");
                }
            }
        }
System.out.println("true");
 }
}