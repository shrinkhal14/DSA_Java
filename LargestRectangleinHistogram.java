class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] left =pse(heights);
        int[] right = nse(heights);
        int maxarea=0;
        
        for(int i=0;i<heights.length;i++){
             int area = heights[i]*(right[i]-left[i]-1);
             maxarea=Math.max(area,maxarea);
        }
    
    return maxarea;

    }
    public int[] pse(int[] heights){
        int[] res = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<heights.length;i++){
            if(st.isEmpty()){
                
                res[i]=-1;
            }
            else if(heights[st.peek()]<heights[i]){
                res[i] = st.peek();
            }
            else {
                
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
               
                if (st.isEmpty()) {
                    res[i] = -1;
                } else {
                    res[i] = st.peek(); 
                }
            }
            st.push(i);
        }
        return res;}
    public int[] nse(int[] heights){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                res[i] = heights.length;
            } else if (heights[st.peek()] < heights[i]) { 
                res[i] = st.peek();
            } else {
                
                while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    res[i] = heights.length;
                } else {
                    res[i] = st.peek();
                }
            }
         
            st.push(i);
        }
        return res;
    }
}
