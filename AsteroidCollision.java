class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            if (current > 0) {
                st.push(current);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(current)) {
                    st.pop();
                }
                if (st.isEmpty() || st.peek() < 0) {
                    st.push(current);
                } else if (st.peek() == Math.abs(current)) {
                    st.pop();
                }
            }
        }
        
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        
        return result;
    }
}
