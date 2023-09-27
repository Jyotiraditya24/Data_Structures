package StackPep;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str = "[(a+b)]";
        boolean ans = balaBracket(str);
        System.out.println(ans);
    }

    public static boolean balaBracket(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char topush = str.charAt(i);
            if (topush != ')' && topush != '}' && topush != ']') {
                st.push(topush);
            } else {
                if (st.empty()) {
                    return false;
                } else if (topush == ')') {
                    while (st.peek() != '(') {
                        if (st.peek() == '{' || st.peek() == '[') {
                            return false;
                        } else st.pop();
                    }
                    st.pop();
                } else if (topush == '}') {
                    while (st.peek() != '{') {
                        if (st.peek() == '(' || st.peek() == '[') {
                            return false;
                        } else st.pop();
                    }
                } else {
                    while (st.peek() != '[') {
                        if (st.peek() == '(' || st.peek() == '{') {
                            return false;
                        } else st.pop();
                    }
                }

            }
        }
        return st.empty();
    }
}
