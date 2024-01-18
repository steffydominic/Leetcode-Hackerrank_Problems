
public class GlassHour {
    public static void main(String[] args) {
        int[][] arr = { { 0, 3, 0, 0, 0 ,0,0},//i=0 
                        { 0, 1, 0, 0, 0,0,0},
                        { 1, 1, 1, 0, 0,0,0},
                        { 0, 0, 2, 0, 4,7,8},
                        { 0, 0, 0, 0, 4,7,8 },
                        { 0, 0, 0, 0, 0,0,0 },
                        { 0, 0, 0, 0, 0,0,0 } };
       int m=7;
       int n=7;
       int sum=0;
      int max=0;
       for(int i=0;i<m-2;i++){
        for(int j=0;j<n-2;j++){
           sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        }

        if(sum>max){
            System.out.println(i);
            max=sum;
            
        }
       }
System.out.println(max);
    }
}
