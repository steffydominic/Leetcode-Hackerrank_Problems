import java.util.Arrays;

public class PermutationorNot {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
           
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1.equals(ch2)) {
            System.out.println("permutations");
        } else {
            System.out.println("not a permutations");
        }
    }
    }
}
