package backtracking;

import static backtracking.NQueen.isSafe;
import static backtracking.NQueen.printBoard;

public class NKnights {
    public static void main(String[] args) {
        boolean[][]board = new boolean[4][4];
        int ans = NKnights(0,4,board);
        System.out.println(ans);
    }

    public static int NKnights(int row,int target,boolean[][]board){
        if(target == 0){
            printBoard(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(row,col,board)){
                board[row][col] = true;
                count = count + NKnights(row+1,target-1,board);
                board[row][col] = false;
            }

        }
        return count;
    }

    public static boolean isSafe(int row,int col,boolean[][]board){

        /*for up up and right*/
        if(row>=2 && col< board.length-1){
            if(board[row-2][col+1]){
                return false;
            }
        }
        /* for up and right right*/
        if(row>=1 && board.length-col > 2){
            if(board[row-1][col+2]){
                return false;
            }
        }
        /* for up and left left*/
        if(row>=1 && col>=2){
            if(board[row-1][col-2]){
                return false;
            }
        }

        /* for up up left*/
        if(row>=2 && col>=1){
            if(board[row-2][col-1]){
                return false;
            }
        }

        /* for down down and right */
        if(board.length-row>2 && col<board.length-1){
            if(board[row+2][col+1]){
                return false;
            }
        }

        /* for down right right */
        if(row<board.length-1 && board.length-col>2){
            if(board[row+1][col+2]){
                return false;
            }
        }


        /* down left left */
        if(row<board.length-1 && col>=2){
            if(board[row+1][col-2]){
                return false;
            }
        }

        /*for down down left*/
        if(board.length-row>2 && col>=1){
            if(board[row+2][col-1]){
                return false;
            }
        }

        return true;
    }
}
