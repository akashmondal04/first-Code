package first_code;

public class Bits {
    public static void main(String[] args) {
        int n=5;
        int position =2;
        int bitmask = 1<<position;
    
        if ((bitmask & n)==0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }  
    }
   
}
