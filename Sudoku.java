package Backtracking;

public class Sudoku {
    public static boolean recurse(int[][] board, int row, int col){
        //base case
        if(row == 9){
            return true;
        }

        //Move to the next row if we have reached beyond the last column
        if(col == 9){
            return recurse(board, row + 1, 0);
        }

        //If the current cell is already filled, move to the next cell
        if(board[row][col] != 0){
            return recurse(board, row, col + 1);
        }

        //Try placing digits from 1 to 9 in the current cell
        for(int digit = 1; digit <= 9; digit++){
            if(isSafe(board, row, col, digit)){
                board[row][col] = digit;
                if(recurse(board, row, col + 1)){
                    return true;
                }
                board[row][col] = 0;// Backtrack
            }
        }

        return false;// No solution found
    }

    //Helper method to check if placing a digit is safe
    public static boolean isSafe(int[][] board, int row, int col, int digit){
        //Check the row
        for(int i = 0; i < 9; i++){
            if(board[row][i] == digit){
                return false;
            }
        }

        //Check the column
        for(int i = 0; i < 9; i++){
            if(board[i][col] == digit){
                return false;
            }
        }

        //Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int i = startRow; i < startRow + 3; i++){
            for(int j = startCol; j < startCol + 3; j++){
                if(board[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(recurse(board, 0, 0)){
            System.out.println("Solution exists:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    // Helper method to print the board
    public static void printBoard(int[][] board){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
