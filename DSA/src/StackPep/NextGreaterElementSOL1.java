package StackPep;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementSOL1 {
    public static void main(String[] args) {
    int[]arr= {2,5,9,3,1,12,6,8,7};
    int[]ans =  nextGreater(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] nextGreater(int[]arr){
        Stack<Pair> st = new Stack<>();
        int[]ans = new int[arr.length];
        st.push(new Pair(arr[0],0));
        for(int i = 1 ;i<arr.length;i++){
            int topVal = st.peek().data;
            int arrData = arr[i];
            if(arrData>topVal){
                while(st.peek().data<arrData){
                    ans[st.peek().index]= arrData;
                    st.pop();
                    if (st.isEmpty()) {
                        break; // Check if the stack is empty before peeking again
                    }
                    topVal = st.peek().data;
                }
            }
                st.push(new Pair(arrData,i));
        }

        for(int j = 0;j<ans.length;j++){
            if(ans[j]==0){
                ans[j]=-1;
            }
        }
        return ans;
    }

    static class Pair{
        int data;
        int index;
        public Pair(int data, int index) {
            this.data = data;
            this.index = index;
        }
    }
}
