
public class Movezeros {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 3, 0, 2, 11 };
        int ans[] = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                ans[index++] = nums[i];
            }
        }

        while (index < ans.length) {
       
            ans[index++] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}