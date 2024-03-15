package first_code;

import java.util.Scanner;

public class funtionToCalculateCircumference {
   public static float circumference(float r){
        float Pi= 3.14f;//must have "f" after the float value
        float cir=2*Pi*r;
        return cir;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter thr Radius: ");
        float r= sc.nextFloat();
        sc.close();
        System.out.println("Circumference of the circle: "+circumference(r));
    }  
}
