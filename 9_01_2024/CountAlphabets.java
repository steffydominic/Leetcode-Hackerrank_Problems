
public class CountAlphabets {
    public static void main(String[] args) {
        String str = "aaabcccccddaa";
        String ans = " ";
        for (int i = 0; i < str.length(); i++) {
            char one = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && one == str.charAt(i + 1)) {
                count++;
                i++;
            }
            ans += one + String.valueOf(count);
        }
        System.out.println(ans);
    }
}