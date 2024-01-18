
public class LuckyNumber {
    public static void main(String[] args) {
        int n = 777;

        String num = String.valueOf(n);

        int result = 0;
        if (num.contains("7")) {
            result = 1;
        }
        System.out.println(result);
    }
}
