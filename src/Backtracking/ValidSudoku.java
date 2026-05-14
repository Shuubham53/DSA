package Backtracking;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board) ? "it is an valid sudoku": "it is an invalid sudoku");

    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    char ch = board[i][j];
                    board[i][j] = '.';
                    if(!helper(board,i,j,ch)) return false;
                    board[i][j] = ch;
                }
            }
        }
        return true;
    }

    private static boolean helper(char[][] board, int row, int col, char ch) {

        // row
        for(int j =0; j<9; j++){
            if(board[row][j] == ch) return false;
        }
        // column
        for(int i = 0; i<9; i++){
            if(board[i][col] == ch) return false;
        }
        int sRow = row/3*3;
        int sCol = col/3*3;
        for(int i = sRow; i<3;i++){
            for(int j = sCol; j<3; j++){
                if(board[i][j] == ch) return false;
            }
        }
        return true;
    }

}
