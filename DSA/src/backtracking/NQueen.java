package backtracking;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[8][8];
//        NQueen(0,maze);
        System.out.println( NQueenCount(0,maze));
    }

    public static void printBoard(boolean[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void NQueen(int row, boolean[][] maze) {
        if (row == maze.length) {
            printBoard(maze);
            return;
        }

        for (int col = 0; col < maze.length; col++) {
            if (isSafe(row, col, maze)) {
                // Place the queen at (row, col)
                maze[row][col] = true;

                // Recurse for the next row
                NQueen(row + 1, maze);

                // Restore the board to its original state
                maze[row][col] = false;
            }
        }
    }


    public static int NQueenCount(int row, boolean[][] maze) {
        if (row == maze.length) {
            printBoard(maze);
            return 1;
        }
        int count  = 0;
        for (int col = 0; col < maze.length; col++) {
            if (isSafe(row, col, maze)) {
                // Place the queen at (row, col)
                maze[row][col] = true;

                // Recurse for the next row
                count += NQueenCount(row + 1, maze);

                // Restore the board to its original state
                maze[row][col] = false;
            }
        }
        return count;
    }


    public static boolean isSafe(int row, int col, boolean[][] maze) {
        // Check if there is a queen in the same row
        for (int i = 0; i < maze.length; i++) {
            if (maze[row][i]) {
                return false;
            }
        }

        // Check if there is a queen in the same column
        for (int i = 0; i < maze.length; i++) {
            if (maze[i][col]) {
                return false;
            }
        }

        // Check if there is a queen in the diagonal positions
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if (maze[i][j] && (Math.abs(i - row) == Math.abs(j - col))) {
                    return false;
                }
            }
        }

        // It is safe to place a queen at (row, col)
        return true;
    }

}



















//
//    public static void NQueens(int row,boolean[][]maze){
//        if(row==maze.length){
//            printBoard(maze);
//            return;
//        }
//
//        for(int col=0;col< maze.length;col++){
//            if(safe(0,col,maze)){
//                maze[row][col] = true;
//                NQueens(row+1,maze);
//                maze[row][col] = false;
//            }
//        }
//    }
//
//    public static boolean safe(int row, int col, boolean[][]maze){
//        /*CHECKING IF QUEEN IN SAME ROW*/
//        for(int i =0 ; i<maze.length;i++){
//            if(maze[row][i]) {
//                return false;
//            }
//        }
//
//        /*CHECKING IF QUEEN IN SAME COLUMN*/
//        for(int i =0; i<maze.length;i++){
//            if(maze[i][col]){
//                return false;
//            }
//        }
//
//        /* CHECKING IF QUEEN IN SAME DIAGONAL */
//        for(int i=0;i< maze.length;i++){
//            for(int j=0;j< maze.length;j++){
//                if(maze[i][j] && (Math.abs(i-row)==Math.abs(j-col))){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//

