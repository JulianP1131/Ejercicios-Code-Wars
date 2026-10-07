
import java.util.HashMap;
import java.util.Map;

class Parser {

    private static final Map<String, Integer> NUMBER_MAP = new HashMap<>();

    static {
        NUMBER_MAP.put("zero", 0);
        NUMBER_MAP.put("one", 1);
        NUMBER_MAP.put("two", 2);
        NUMBER_MAP.put("three", 3);
        NUMBER_MAP.put("four", 4);
        NUMBER_MAP.put("five", 5);
        NUMBER_MAP.put("six", 6);
        NUMBER_MAP.put("seven", 7);
        NUMBER_MAP.put("eight", 8);
        NUMBER_MAP.put("nine", 9);
        NUMBER_MAP.put("ten", 10);
        NUMBER_MAP.put("eleven", 11);
        NUMBER_MAP.put("twelve", 12);
        NUMBER_MAP.put("thirteen", 13);
        NUMBER_MAP.put("fourteen", 14);
        NUMBER_MAP.put("fifteen", 15);
        NUMBER_MAP.put("sixteen", 16);
        NUMBER_MAP.put("seventeen", 17);
        NUMBER_MAP.put("eighteen", 18);
        NUMBER_MAP.put("nineteen", 19);
        NUMBER_MAP.put("twenty", 20);
        NUMBER_MAP.put("thirty", 30);
        NUMBER_MAP.put("forty", 40);
        NUMBER_MAP.put("fifty", 50);
        NUMBER_MAP.put("sixty", 60);
        NUMBER_MAP.put("seventy", 70);
        NUMBER_MAP.put("eighty", 80);
        NUMBER_MAP.put("ninety", 90);
    }

    public static int parseInt(String numStr) {
        String[] tokens = numStr.replace("-", " ").split("\\s+");

        int total = 0;
        int current = 0;

        for (String token : tokens) {
            if (token.equals("and")) {
                continue;
            }

            if (token.equals("million")) {
                current *= 1_000_000;
                total += current;
                current = 0;
            } else if (token.equals("thousand")) {
                current *= 1_000;
                total += current;
                current = 0;
            } else if (token.equals("hundred")) {
                current *= 100;
            } else if (NUMBER_MAP.containsKey(token)) {
                current += NUMBER_MAP.get(token);
            }
        }

        return total + current;
    }
}
