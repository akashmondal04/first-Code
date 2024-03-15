package first_code;
import java.util.*;

public class primeNoCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

            boolean isPrime = true;
            for(int i=2; i<=n/2; i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                if(n==1){
                    System.out.println("This is niether prime nor composite");
                }else{
                    System.out.println("This is prime");
                }
            }else{
                System.out.println("This is not a Prime Number");
            }
        scanner.close();    

    }
    
}
