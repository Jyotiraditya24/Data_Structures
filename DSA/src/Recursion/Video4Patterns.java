package Recursion;

import java.util.Arrays;

public class Video4Patterns {
    public static void main(String[] args) {
//        patternOne(4,0);
//        triangle(1,1);
        int[]arr = {2,-1,-10,10};
        bubbleSort(4,0,arr);
    }

    public static void patternOne(int row , int col){
        if(row==1){
            System.out.print("*");
            return;
        }
        if(col < row){
            System.out.print("*");
            patternOne(row,col+1);
        }else {
            System.out.println();
            patternOne(row-1,0);
        }
    }
    public static void triangle(int row,int col){
        if(row == 4 && col ==4){
            System.out.print("*");
            return;
        }
        if(col <= row){
            System.out.print("*");
            triangle(row,col+1);
        }if (col > row ){
            System.out.println();
            triangle(row+1,1);
        }
    }
    public static void bubbleSort(int i , int j,int[]arr){
        if(i<1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(j==i-1){
            System.out.println();
            bubbleSort(i-1,0,arr);
        }
        else{
            if(arr[j+1]<arr[j]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubbleSort(i,j+1,arr);
        }
    }
}
