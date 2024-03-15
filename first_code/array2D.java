package first_code;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Rows");
        int row=sc.nextInt();// rowsInput
       
        System.out.println("cols");
        int col=sc.nextInt();// colsInput
       
        int matrix[][]=new int[row][col];//2d array decleared

        //Input
        //Row
        for(int i=0; i<row; i++){
            System.out.println("Enter row "+i);
            for(int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
