public class HappyNumber {
    public static void main(String[] args) {

        int num = 19;

        while (num != 1 && num != 4) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }

        if (num == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}