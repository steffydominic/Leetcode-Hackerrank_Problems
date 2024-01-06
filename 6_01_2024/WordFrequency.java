import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "the day is sunny the the the sunny is is";
        String arr[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
