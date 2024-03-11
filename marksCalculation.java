package first_code;
import java.util.*;;
public class marksCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
            do{
                int marks =sc.nextInt();
                if(marks<=100 && marks>=90){
                System.out.println("This is Good");
                }else if(marks<=89 && marks>=60){
                System.out.println("This is also good");
                }else if(marks<=59 && marks>=0){
                System.out.println("This is good as well");
                }else{
                System.out.println("Invalid");
                }
            }while(input==1);
            sc.close();
    }
    
}
