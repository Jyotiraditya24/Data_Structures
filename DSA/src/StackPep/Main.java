package StackPep;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
    String str = "(a+b+c+d)";
        System.out.println(DuplicateBrackets(str));

    }

    public static boolean DuplicateBrackets(String str){
        Stack<Character> stack = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                if(stack.peek()=='(')return true;
                else {
                    while (stack.peek()!='('){
                        stack.pop();
                    }
                    stack.pop();
                }
            }else {
                stack.push(ch);
            }
        }
        return false;

    }
}
