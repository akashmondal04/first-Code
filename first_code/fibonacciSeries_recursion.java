package first_code;

import java.util.Scanner;

public class fibonacciSeries_recursion {
      public static void print(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c= a + b;
        System.out.print(c+" ");
        print(b,c,n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the nth Term: ");
        int n= sc.nextInt();
        sc.close();
        
            System.out.print("Fibonacci series till "+n+"th term: ");
            int a=0;
            int b=1;
            System.out.print(a+" ");
            System.out.print(b+" ");
            print(a,b,n-2);
    }
    
}
