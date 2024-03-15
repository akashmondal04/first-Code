package first_code;

import java.util.Scanner;

public class selectionSort {
    public static void Sort(int[]arr){
        //Selection Sort
        for(int i=0; i<arr.length-1; i++){
            int min=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;   
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            if(min!=i){
                
            }
        }
        printArray(arr);
    }
    public static void printArray(int[]arr){
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter Array");
        Scanner sc=new Scanner(System.in);
        int[]array=new int[sc.nextInt()];
        // Inputs in array
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        Sort(array);
        sc.close();
    }
    
}
