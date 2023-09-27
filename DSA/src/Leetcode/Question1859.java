package Leetcode;

import java.util.Arrays;

public class Question1859 {
    public static void main(String[] args) {
    String s = "KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[]arr = s.split(" ");
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            int length = str.length();
            int correctIndex = str.charAt(length-1) - '0';
            String temp = arr[i];
            arr[i] = arr[correctIndex-1];
            arr[correctIndex-1] = temp;
        }
        for(int i=0;i< arr.length;i++){
            String sub = arr[i].substring(0,arr[i].length()-1);
            answer.append(" ").append(sub);
        }
        return answer.toString().trim();
    }
}
