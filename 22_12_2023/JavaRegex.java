import java.util.*;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String n = scan.next();
            System.out.println(n.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
}