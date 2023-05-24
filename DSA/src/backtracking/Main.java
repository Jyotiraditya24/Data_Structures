package backtracking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path(" ",3,3);
//        System.out.println(pathInArrayListDiagonal("",3,3));
//        pathWithObstacles("",0,0);
        boolean [][]board = {
                {true, true, true,},
                {true,true,true},
                {true,true,true},
        };
//        pathWithObstacles2("",board,0,0);
        backTrack("",board,0,0);
    }

    static int count (int row , int col){
        if(row==1 || col==1){
            return 1;
        }
        int count1 = count(row-1,col);
        int count2 = count(row,col-1);
        return count1 + count2;
    }
    static void path(String p , int row,int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) {
            path(p + "D", row - 1, col);
        }
        if (col > 1) {
            path(p + "R", row, col - 1);
        }
    }
    static ArrayList<String> pathInArrayList(String p, int row,int col){
        if(row ==1 && col ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        if(row > 1){
            left = pathInArrayList(p+"D",row-1,col);
        }
        if(col> 1){
         right = pathInArrayList(p+"R",row,col-1);
        }
        ans.addAll(left);
        ans.addAll(right);
        return ans;
    }
    static ArrayList<String> pathInArrayList2(String p, int row,int col){
        if(row ==1 && col ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(row > 1){
            ans.addAll(pathInArrayList2(p+"D",row-1,col));
        }
        if(col> 1){
            ans.addAll(pathInArrayList2(p+"R",row,col-1));
        }
        return ans;
    }

    static ArrayList<String> pathInArrayListDiagonal(String p, int row, int col){
        if(row ==1 && col ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return  list;
        }
        ArrayList<String> ans = new ArrayList<>();


        if(row > 1){
            ans.addAll(pathInArrayListDiagonal(p+"D",row-1,col));
        }
        if(col> 1){
            ans.addAll(pathInArrayListDiagonal(p+"R",row,col-1));
        }
        if(row >1 && col >1) {
            ans.addAll(pathInArrayListDiagonal(p+"DI",row-1,col-1));
        }
        return ans;
    }


    static void pathWithObstacles(String p, int row, int col){
        if(row == 1 && col==1){
            return;
        }
        if(row==2 && col ==2){
            System.out.println(p);
            return;
        }

        if(row < 2){
            pathWithObstacles(p+"D",row+1,col);
        }
        if(col<2){
            pathWithObstacles(p+"R",row,col+1);
        }
    }
    static void pathWithObstacles2(String p, boolean [][]maze,int row, int col){
        if(!maze[row][col]){
            return; /* if false then return*/
        }
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(row < maze.length-1){
            pathWithObstacles(p+"D",row+1,col);
        }
        if(col<maze[0].length -1 ){
            pathWithObstacles(p+"R",row,col+1);
        }
    }

    static void backTrack(String p,boolean[][]maze,int row,int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] = false;
        if(row<maze.length-1 ){
            backTrack(p+"D",maze,row+1,col);
        }
        if(col< maze[0].length -1 ){
            backTrack(p+"R",maze,row,col+1);
        }
        if(row>0){
            backTrack(p+"U",maze,row-1,col);
        }
        if(col>0){
            backTrack(p+"L",maze,row,col-1);
        }
        maze[row][col] = true;
    }
}
