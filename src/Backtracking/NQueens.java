package Backtracking;

public class NQueens {
    public static void main(String[] args){
        int n = 4;
        char[][] chess = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                chess[i][j] = 'X';
            }
        }


        helper(chess,0);
    }
    public static void helper(char[][] chess,int row){
        int n = chess.length;;
        if(row == n){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    System.out.print(chess[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for(int j = 0; j<n; j++){
            if(isSafe(chess,row,j)){
                chess[row][j] = 'Q';
                helper(chess,row+1);
                chess[row][j] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] chess, int row, int col) {
        int n =  chess.length;
        // west + east
        for(int j = 0; j<n; j++){
            if(chess[row][j] == 'Q') return false;
        }
        // north + south
        for(int j = 0; j<n; j++){
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
        // south-east
        while(i < n && j < n){
            if(chess[i][j] == 'Q') return false;
            i++;
            j++;
        }

        i = row;
        j = col;
        // south-west
        while(i < n && j >= 0){
            if(chess[i][j] == 'Q') return false;
            i++;
            j--;
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
}
