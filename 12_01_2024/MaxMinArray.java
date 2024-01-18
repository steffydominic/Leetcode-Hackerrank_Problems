import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 7, 9};
        Arrays.sort(arr);
        int[] newarr = new int[arr.length];
        int left = 0, right = arr.length - 1;
        for (int i = 0; i < newarr.length; i++) {
            if (i % 2 == 0) {
                newarr[i] = arr[right--];
            } else {
                newarr[i] = arr[left++];
            }
        }


        System.out.println(Arrays.toString(newarr));
    }
}

