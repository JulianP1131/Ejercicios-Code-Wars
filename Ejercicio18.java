
class PigLatin {

    public static String pigIt(String str) {
        return str.replaceAll("\\b([a-zA-Z])(\\w*)\\b", "$2$1ay");
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
    }
}
