
public class arraySign {
    public static void main(String[] args) {
        int count = 0;
        int nums[] = { -1, -2, -3, -4, 3, 2, 1 };
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                System.out.println("0");
            }

            else if (nums[i] < 0) {
                count++;
            }
        }

        if (count % 2 != 0) {
            System.out.println("-1");
        }

        else {
            System.out.println("1");
        }
    }
}
