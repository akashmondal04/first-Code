package first_code;

import java.util.Scanner;

public class primeNoCheck1 {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int i=0;
        for(int j=1; j<=num;j++){
            if(num%j==0){
                i++;
            }
        }
        if(i==2){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }
    }
}
