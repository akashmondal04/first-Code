package first_code;

public class Recursion1 {
    public static void print(int i){
        int n=10;
        if(i==(n+1)){   //BASE CASE
            return;
        }
        System.out.print(i);
        print(i+1); //Recursion
    }
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    
}