package StriverRecursionQuestion;

import java.util.ArrayList;

public class Experiment {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        Object[] arr = list.toArray();
        for(Object i : arr){
            System.out.println(i);
        }
    }
}
