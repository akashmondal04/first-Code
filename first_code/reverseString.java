package first_code;

public class reverseString {
    public static void main(String[] args) {
        StringBuilder xBuilder=new StringBuilder("1234");
        for(int i=0; i<xBuilder.length()/2; i++){
            int front = i;
            int back = xBuilder.length()-1-i;//3-2-1

            char frontch=xBuilder.charAt(front);
            char backch=xBuilder.charAt(back);

            xBuilder.setCharAt(front, backch);
            xBuilder.setCharAt(back, frontch);
        }
        System.out.println(xBuilder);
    }
}
