public class LongestPalindromSubstring {

    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }
        String a = s.substring(0, 1);
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String str = "";

            for (int j = i + 1; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (ch == c) {
                    str = s.substring(i, j + 1);
                }
            }

            if (str.length() > max) {
                a = str;
                max = str.length();
            }
        }

        return a;
    }
}
