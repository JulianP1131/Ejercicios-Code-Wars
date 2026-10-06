class ProdFib {

    public static long[] productFib(long prod) {
        long a = 0;
        long b = 1;

        while (a * b < prod) {
            long temp = a + b;
            a = b;
            b = temp;
        }

        return new long[]{a, b, a * b == prod ? 1 : 0};
    }
}