import java.util.*;

public class numDifferentIntegers {
    public static void main(String[] args) {

        String word = "a123bc34d8ef34";

        String arr[] = word.replaceAll("[a-zA-Z]", " ").split("\\s+");
        Set<String> set = new HashSet<String>();

        for (String str : arr) {
            if (!str.isEmpty())
                set.add(String.valueOf(str.replaceAll("^0*", "")));
        }

        System.out.println(set.size());
    }
}