package Backtracking;

public class NQueens2 {
    static int  ans = 0;

    public static void main(String[] args) {
        int n = 6;
        int result = totalNQueens(n);
        System.out.println(result);
    }
    public static void helper(char[][] chess,int row){
        int n = chess.length;
        if(row == n){
            ans += 1;
            return;
        }

        for(int j = 0; j<n; j++){
            if(isSafe(chess,row,j)){
                chess[row][j] = 'Q';
                helper(chess,row+1);
                chess[row][j] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] chess, int row, int col) {
        int n =  chess.length;

        // north + south
        for(int j = 0; j<row; j++){
            if(chess[j][col] == 'Q') return false;
        }
        int i = row;
        int j = col;
        // north-east
        while(i >= 0 && j < n){
            if(chess[i][j] == 'Q') return false;
            i--;
            j++;
        }
        i = row;
        j = col;
        // north-west
        while(i >= 0 && j >= 0){
            if(chess[i][j] == 'Q') return false;
            i--;
            j--;
        }
        // no attack place found , you can place queen here
        return true;


    }
    public static int totalNQueens(int n) {

        char[][] chess = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                chess[i][j] = '.';
            }
        }
        helper(chess,0);
        return ans;
    }
}
