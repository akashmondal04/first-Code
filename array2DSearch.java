package first_code;

import java.util.Scanner;

public class array2DSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];

         //Input
        //Row
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter x: ");
        int x=sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++ ){
                if(matrix[i][j]==x){
                    System.out.print("x found at location("+i+","+j+")");
                }
            }
        }
            
    sc.close();
    }
}
