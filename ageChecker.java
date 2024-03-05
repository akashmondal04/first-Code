package first_code;

import java.util.Scanner;

public class ageChecker {
     public static int ageChecker(int a){
        if(a>=18){
            System.out.println("You are Eligible to Vote");
        }else{
            System.out.println("Sorry! You are Not Eligible to vote");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter Your Age: ");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        ageChecker(a);
    }
    
}
