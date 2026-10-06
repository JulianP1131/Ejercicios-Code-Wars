/* In this kata you are required to, given a string, replace every letter with its position in the alphabet.

If anything in the text isn't a letter, ignore it and don't return it.

"a" = 1, "b" = 2, etc. */
class Ejercicio2 {

    public static String alphabetPosition(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result.append(c - 'a' + 1).append(" ");
            }
        }

        return result.toString().trim();
    }
}
