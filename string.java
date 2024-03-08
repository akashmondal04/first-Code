package first_code;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number1 = sc.next();
        String number2 = sc.next();
    
        int num2 =Integer.parseInt(number2);
        int num =Integer.parseInt(number1);
    
        int sum=num+num2;
        System.out.println(sum); 
        sc.close(); 
    }   
}
