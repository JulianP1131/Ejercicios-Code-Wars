import java.util.HashMap;
import java.util.Map;

class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (char c : str.toCharArray()) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }

        return result;
    }
}