public class MultiplicationTable {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;

        // Print multiplication tables
        for (int i = 1; i <= n; i++) {
            System.out.println("Multiplication table of " + i);

            for (int j = 1; j <= m; j++) {
                System.out.println(i + "x" + j + " = " + (i * j));
            }
        }
    }
}

