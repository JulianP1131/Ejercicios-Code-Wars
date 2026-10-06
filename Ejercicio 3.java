import java.util.HashMap;
import java.util.Map;

class Ejercicio3 {
    public static int duplicateCount(String text) {
        Map<Character, Integer> counts = new HashMap<>();
      
      for (char c : text.toLowerCase().toCharArray()) {
        counts.put(c, counts.getOrDefault(c, 0) + 1);
      }
      int duplicates = 0;
      
      for (int count : counts.values()) {
        if (count > 1) {
          duplicates++;
        }
      }
      return duplicates;
    }
}