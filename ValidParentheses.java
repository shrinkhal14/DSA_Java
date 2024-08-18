import java.util.Stack;

public class ValidParentheses {
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        //Traverse the string
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            //Push opening brackets onto the stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            //Check for corresponding closing brackets
            else if (current == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (current == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (current == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            //If there's a mismatch or stack is empty when it shouldn't be
            else {
                return false;
            }
        }
        
        //If stack is empty, all parentheses were matched correctly
        return stack.isEmpty();
    }
    
    
    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        
        System.out.println(vp.isValid("()"));     // true
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("(]"));     // false
        System.out.println(vp.isValid("([)]"));   // false
        System.out.println(vp.isValid("{[]}"));   // true
    }
}
