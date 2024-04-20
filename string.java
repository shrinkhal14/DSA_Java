public class string {
    double width;
    double breadth;
    double height;
    @overloading
    public static String toString(double width,double breadth, double height){

        return "The width,height and breadth of the box is:"+width+" "+breadth+" "+height;
      
    }

    public static void main(String[] args){
        System.out.println(toString(99.5,67.8,90));
        String s = "This is a getchar demo";
        int start =10;
        int end =14;
        char buf[] = new char[end-start];
        s.getChars(start,end,buf,0);  
        System.out.println(buf);
    }

}
