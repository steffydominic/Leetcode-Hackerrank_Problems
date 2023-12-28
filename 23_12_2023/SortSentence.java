
public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String elem : str) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');
            res[i - 1] = elem.substring(0, elem.length() - 1);
        }

        for (i = 0; i < res.length - 1; i++)
            sb.append(res[i]).append(" ");
        sb.append(res[i]);
        System.out.println(sb.toString());
    }
}
