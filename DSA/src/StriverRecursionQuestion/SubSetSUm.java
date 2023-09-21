package StriverRecursionQuestion;

import java.util.ArrayList;

public class SubSetSUm {
    public static void main(String[] args) {
        int[]arr = {5,2,1};
        ArrayList<Integer> f = new ArrayList<>();
        ArrayList<Integer> answer = subsetSum(arr,0,0);
        System.out.println(answer);
    }

    public static ArrayList<Integer> subsetSum(int[]arr, int sum, int index){
        ArrayList<Integer> answer = new ArrayList<>();
        if(index==arr.length){
            ArrayList<Integer>localAnswer = new ArrayList<>();
            localAnswer.add(sum);
            return localAnswer;
        }

        ArrayList<Integer> left = subsetSum(arr,sum + arr[index],index+1);
        ArrayList<Integer> right = subsetSum(arr,sum,index+1);

        answer.addAll(left);
        answer.addAll(right);

        return answer;

    }
}
