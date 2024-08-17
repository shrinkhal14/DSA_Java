import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s, top);
    }

    public static void insertAtBottom(Stack<Integer> s, int item) {
        if(s.isEmpty()) {
            s.push(item);
            return;
        }

        int top = s.pop();
        insertAtBottom(s, item);
        s.push(top);
    }
}
