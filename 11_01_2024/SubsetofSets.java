 class SubsetofSets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;

        int allsubsets = (int) Math.pow(2, n);//2*2*2
        

        for (int i = 0; i < allsubsets; i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if ((i / (int) Math.pow(2, j)) % 2 == 1) {
                 
                        System.out.print(nums[j]);
                    if (j < n - 1) {
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("}");
        }
    }
}
