class RemoveNonalphabets {
    public static void main(String[] args) {

        String str = "Steffy123";

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                ans += ch;
            }
        }

        System.out.println(ans);
    }
}
