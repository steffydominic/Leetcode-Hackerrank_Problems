public class RotateArray {
 public static void main(String[] args){
    int[] nums={1,2,3,4,5};
    int rotation=3;
    int ans[]=new int[nums.length];
    int j=0;
    for(int i=nums.length-rotation;i<nums.length;i++){
            ans[j++]=nums[i];
    }
    for(int i=0;i<nums.length-rotation;i++){
        ans[j++]=nums[i];
    }
    for(int i=0;i<nums.length;i++){
        nums[i]=ans[i];
    }
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    } 
}

    }
    // public void rotate(int[] nums, int k) {
    //     int ans[]=new int[nums.length];
    //     int j=0;
    //     if(nums.length>k){
    //     for(int i=nums.length-k;i<nums.length;i++){
    //         ans[j++]=nums[i];
    //     }
    //     for(int i=0;i<nums.length-k;i++){
    //         ans[j++]=nums[i];
    //     }
       
    //       for( int i=0;i<ans.length;i++){
    //           nums[i]=ans[i];
    //       }
    //     }
    // }