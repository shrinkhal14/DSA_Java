import java.util.Stack;

public class ReverseStringStack {
    public static void main(String[] args) {
        String str = "github";
        String reversedStr = reverse(str);
        System.out.println(reversedStr);
    }

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        for (int idx = 0; idx < str.length(); idx++) {
            s.push(str.charAt(idx));
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            Character c = s.pop();
            result.append(c);
        }

        return result.toString();
    }
}
