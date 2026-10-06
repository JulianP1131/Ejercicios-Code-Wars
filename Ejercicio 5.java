/* Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer. */
class DRoot {

    public static int digital_root(int n) {
        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        return n;
    }
}
