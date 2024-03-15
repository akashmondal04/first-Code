package first_code;

import java.util.Scanner;

public class Bits1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //oper=1 set; oper=0 clear;
        int oper=scanner.nextInt();
        scanner.close();

        int n=15; // 0bin:1111
        int position=0;

        int bitMask =1<<position;
        if(oper==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber=newBitMask&n;
            System.out.println(newNumber);

        }
    }
    
}
