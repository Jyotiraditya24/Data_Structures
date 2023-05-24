package Recursion.SubsetQuestion;

/* permutations and combinations , [3,5,9] -> [3],[3,5] ,[3,9], [3,5,9], [5] ..
* in subsets ordering cannot change
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetQ1 {
    public static void main(String[] args) {
        String str = "abc";
        int[]arr = {1,2,3};
        printSubset("", str);
        System.out.println(printSubset2("", str));
        System.out.println(printSubset3("", str));
        System.out.println(IterativeSubset2(arr));
    }
//    Find the subset of the string
//    very important in every ans we a3re either taking or removing an element
//    in [a,b] we remove c and took a and b
//    this pattern of taking some element and removing some is know as subset pattern

    public static void printSubset(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        printSubset(processed + unprocessed.charAt(0), unprocessed.substring(1));
        printSubset(processed, unprocessed.substring(1));

    }

    public static ArrayList<String> printSubset2(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> leftList = printSubset2(processed + unprocessed.charAt(0), unprocessed.substring(1));
        ArrayList<String> rightList = printSubset2(processed, unprocessed.substring(1));
        leftList.addAll(rightList);
        return leftList;
    }

    public static ArrayList<String> printSubset3(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> leftList = printSubset2(processed + unprocessed.charAt(0), unprocessed.substring(1));
        ArrayList<String> rightList = printSubset2(processed, unprocessed.substring(1));
        ArrayList<String> middleList = printSubset2(processed + (unprocessed.charAt(0) + 0), unprocessed.substring(1));

        leftList.addAll(rightList);
        leftList.addAll(middleList);
        return leftList;
    }
    public static List<List<Integer>> IterativeSubset(int[]arr){
         List<List<Integer>> outer = new ArrayList<>();
         outer.add(new ArrayList<>());
        for(int num: arr){
            int size = outer.size();
            for (int i=0;i<size;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return  outer;
    }
    public static List<List<Integer>> IterativeSubset2(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int j: arr){
            int size = outer.size();
            for (int i=0;i<size;i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(j);
                outer.add(inner);
            }
        }
        return outer;
    }
}
