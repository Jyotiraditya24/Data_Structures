package Recursion.SubsetQuestion;

/* permutations and combinations , [3,5,9] -> [3],[3,5] ,[3,9], [3,5,9], [5] ..
* in subsets ordering cannot change
* */

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetQ1 {
    public static void main(String[] args) {
        String str = "abc";
        printSubset("", str);
        System.out.println(printSubset2("", str));
        System.out.println(printSubset3("", str));
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
}
