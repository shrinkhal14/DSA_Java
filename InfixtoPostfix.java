import java.util.Stack;

public class InfixtoPostfix {

    public static int priority(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '*' || c == '/') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        }
        return -1;
    }

    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //if the character is an operand, add it to output
            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            }
            //if the character is '(', push it to the stack
            else if (c == '(') {
                st.push(c);
            }
            //if the character is ')', pop and output from the stack until '(' is found
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // Remove the '(' from the stack
            }
            //an operator is encountered
            else {
                while (!st.isEmpty() && priority(c) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }

        //pop all the operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix expression: " + infixToPostfix(expression));
    }
}
