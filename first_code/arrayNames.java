package first_code;

import java.util.Scanner;

public class arrayNames {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        

        String name[]=new String[size];

            //Input Name
            for(int i=0; i<size; i++){
                name[i]=sc.next();                       
            }
            //Output Name
            for(int i=0; i<name.length; i++){
                System.out.print(name[i]+" ");
            }
            sc.close();
        
    }
    
}
