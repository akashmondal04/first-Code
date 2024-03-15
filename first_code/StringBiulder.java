package first_code;

public class StringBiulder {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        System.out.println(sb);

        // Char At Index
        // System.out.println(sb.charAt( 0));
        // System.out.println(sb.charAt(1));

        //Set Char at Index
        sb.setCharAt(0, 'J');
        sb.setCharAt(1, 'a');
        System.out.println(sb);
    }
}
