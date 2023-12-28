import java.math.BigDecimal;
import java.util.*;
class  JavaBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
       for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            BigDecimal bd1 = new BigDecimal(s[j]);
            BigDecimal bd2 = new BigDecimal(s[j + 1]);
            if (bd1.compareTo(bd2) == -1) {
                String smallerNum = s[j];
                s[j] = s[j + 1];
                s[j + 1] = smallerNum;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}