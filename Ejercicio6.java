/* Given a random non-negative number, you have to return the digits of this number within an array in reverse order. */
class Kata {

    public static int[] digitize(long n) {
        String num = Long.toString(n);
        int[] result = new int[num.length()];

        for (int i = 0; i < num.length(); i++) {
            result[i] = num.charAt(num.length() - 1 - i) - '0';
        }

        return result;
    }
}
