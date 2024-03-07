package first_code;

import java.util.Scanner;

public class array2D {
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
