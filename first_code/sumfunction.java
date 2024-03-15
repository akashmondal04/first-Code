package first_code;

import java.util.Scanner;

/**
 * sumfunction
 */

public class sumfunction {

    public static int sum(int i,int j){
    int sum=i+j;
    return sum;
}    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a=sc.nextInt();
        System.out.print("Enter second Number: ");
        int b=sc.nextInt();
        int sum1=sum(a, b);
        sc.close();
       
        System.out.println("The Sum of two numbers is: "+sum1);
        
    
    
}
    
}