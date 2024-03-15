package first_code;

import java.util.Scanner;

public class bubbleSorting {
    public static void printArray(int arr[]){
      
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

    }
    public static void bubbleSort(int[]arr){
        //bubble sort
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int x=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                }
//                printArray(arr);
            }
//            printArray(arr);
        }
        printArray(arr);

    }
    public static void main(String[] args) {//
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n= sc.nextInt(); //Var to take Array Size Input
        int[]arr=new int[n];
        System.out.println("Enter the Numbers to sort");
        //Iteration to scan Arrays input
        for(int z=0; z<arr.length; z++){
            
            arr[z]= sc.nextInt();
        }
        sc.close();
    bubbleSort(arr);
   }
}
