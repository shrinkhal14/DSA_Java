import java.util.Stack;

public class InfixtoPrefix {
    
    //function to reverse a string
    public static String reverse(String s) {
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }

    //function to get the precedence of an operator
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '^') {
            return 3;
        }
        return -1;
    }

    //function to convert infix expression to prefix
    public static String infixToPrefix(String s) {
        // Reverse the infix expression
        s = reverse(s);
        
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            //if the character is an operand, add it to the result
            if (Character.isLetterOrDigit(c)) {
                res.append(c);
            }
            //if the character is ')', push it to the stack
            else if (c == ')') {
                st.push(c);
            }
            //if the character is '(', pop from the stack until ')' is found
            else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    res.append(st.pop());
                }
                st.pop(); // Remove the ')'
            }
            //if an operator is encountered
            else {
                while (!st.isEmpty() && precedence(c) < precedence(st.peek())) {
                    res.append(st.pop());
                }
                st.push(c);
            }
        }

        //pop all remaining operators from the stack
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        //reverse the result to get the final prefix expression
        return reverse(res.toString());
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Prefix expression: " + infixToPrefix(expression));
    }
}
