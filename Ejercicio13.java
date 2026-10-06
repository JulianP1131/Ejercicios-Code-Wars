import java.util.Stack;

class DirReduction {

    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<>();

        for (String dir : arr) {
            if (!stack.isEmpty() && isOpposite(stack.peek(), dir)) {
                stack.pop();
            } else {
                stack.push(dir);
            }
        }

        return stack.toArray(new String[0]);
    }

    private static boolean isOpposite(String a, String b) {
        return (a.equals("NORTH") && b.equals("SOUTH")) ||
               (a.equals("SOUTH") && b.equals("NORTH")) ||
               (a.equals("EAST") && b.equals("WEST")) ||
               (a.equals("WEST") && b.equals("EAST"));
    }
}