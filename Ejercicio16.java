class Solution {

    public static String camelCase(String str) {
        StringBuilder result = new StringBuilder();

        for (String word : str.split(" ")) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1));
            }
        }

        return result.toString();
    }
}