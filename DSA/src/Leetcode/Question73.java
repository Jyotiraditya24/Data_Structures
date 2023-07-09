package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Question73 {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5},
        };

        ArrayList<Integer> rowList = new ArrayList<>();
        ArrayList<Integer> colList = new ArrayList<>();

       for(int row = 0; row<arr.length;row++){
           for(int col = 0;col<arr[row].length;col++){
               if(arr[row][col] == 0){
                   rowList.add(row);
                   colList.add(col);
               }
           }
       }

       for(int i = 0 ; i<rowList.size();i++){
           int row = rowList.get(i);
           int col = colList.get(i);
           for(int j = 0; j<arr[row].length;j++){
               arr[row][j] = 0;
           }
           for(int k = 0; k<arr.length;k++){
               arr[k][col] = 0;
           }
       }

      for (int i = 0 ; i<arr.length;i++){
          System.out.println(Arrays.toString(arr[i]));
      }
    }
}

