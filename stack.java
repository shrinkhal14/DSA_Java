import java.util.ArrayList;
public class stack {
    static class StackA{
        static ArrayList<Integer> list = new ArrayList<>();

        //to check if the stack is empty.
        public static boolean isEmpty(){
            return list.size()==0;
        }

        //push an element into stack
        public void push(int data){
            list.add(data);
        }
        
        //pop an element
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek an element
        public int peek(){
            return list.get(list.size()-1);
        }


    }
    public static void main(String[] args) {
        StackA s = new StackA();
        s.push(9);
        s.push(2);
        s.push(21);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
