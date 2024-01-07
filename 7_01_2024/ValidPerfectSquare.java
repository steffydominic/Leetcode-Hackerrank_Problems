
public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num=16;
        double n=Math.sqrt(num);
        int val=(int) n;
        if((val*val)==num){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        }
}
