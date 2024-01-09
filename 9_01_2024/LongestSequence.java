import java.util.ArrayList;

;

public class LongestSequence {
    public static void main(String[] args) {
        int arr[] = { 100, 2, 200, 3, 1, 4 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
             if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
             }
            }
        }
        ArrayList<Integer> newarr=new ArrayList<Integer>();
            int val=arr[1]-arr[0];
            newarr.add(val);
        for(int i=0;i<arr.length-1;i++){
            int j=i+1;
            if(val+arr[i]==arr[j]){
              newarr.add(arr[j]);
            }
        }
        for(int i=0;i<newarr.size();i++){
            System.out.print(newarr.get(i)+" ");
        }

        int ans=newarr.size();
        System.out.println(ans);
        }
    }

