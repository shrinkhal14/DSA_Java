package Recursion;

public class BasicRecursionPrograms {
    public static void main(String[] args) {
        printback(5);
        printfor(1,15);
        System.out.println(sum(5));
        System.out.println(fact(6));
        System.out.println(fibo(20));
        System.out.println(power(2, 5));
        System.out.println(poweropt(2, 5));
    }
//print n to 1 using recursion
public static void printback(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    printback(n-1);
}
//print from 1 to n using recursion
public static void printfor(int i, int n){
    if(i>n) return;
    System.out.println(i);
    printfor(i+1,n);
}
//print sum of first n natural numbers
public static int sum(int n){
    if(n==1){
        return 1;
    }
    return n + sum(n-1);
}
//print factorial of a number
public static int fact(int n){
    if(n==0||n==1){
        return 1;
    }
    return n*fact(n-1);
}
//print fibonacci till nth term
public static int fibo(int n){
    
    if(n==1) return 0;
    if(n==2) return 1;
    return fibo(n-1)+fibo(n-2);
}
//print power of a number (stack height =n)
public static int power(int n, int p){
    if(p==0) return 1;
    if(p ==1) return n;
    return power(n,p-1);
}
//print power of a number (stack height =log n)
public static int poweropt(int i,int n){
    if(n==0) return 1;
    if(n==1) return i;
    if(n%2==0){
        int hp = poweropt(i,n/2);
        return hp*hp;
    }
    else{
        int hp = poweropt(i,n/2);
        return i*hp*hp;
    }
}
}