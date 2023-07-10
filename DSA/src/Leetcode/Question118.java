package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public static void main(String[] args) {
        List<List<Integer>> ans =   generate(10);
        printTriangle(ans);

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mainList = new ArrayList<>();
        if(numRows<0){
            return mainList;
        }
        for (int i = 0; i < numRows; i++) {
         List<Integer> localList = new ArrayList<>(i+1);
         if(i == 0){
             localList.add(1);
         }else {
             List<Integer> previousList = mainList.get(i-1);
             localList.add(1);
             for(int j = 1; j < i;j++){
                 int one = previousList.get(j-1);
                 int two = previousList.get(j);
                 int sum = one + two;
                 localList.add(sum);
             }
             localList.add(1);
         }
            mainList.add(localList);

        }
        return mainList;

    }

    public static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
