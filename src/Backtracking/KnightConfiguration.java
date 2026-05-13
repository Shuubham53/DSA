package Backtracking;

public class KnightConfiguration {
    public static void main(String[] args) {
        int n = 5;
        int[][] grid = {{0,11,16,5,20},
                        {17,4,19,10,15},
                        {12,1,8,21,6},
                        {3,18,23,14,9},
                        {24,13,2,7,22}
        };
        if(grid[0][0] != 0){
            System.out.println("Invalid");
        }

        System.out.println(isValid(grid,0,0,0) ? "Valid configuration" : "Invalid Configuration");

    }

    public static boolean isValid(int[][] grid,int row,int col,int num){
        int n = grid.length;
        if(grid[row][col] == n * n - 1) return true;

        // up + left
        int i = row-2;
        int j = col-1;
        if( i >= 0 && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // up + right
        i = row-2;
        j = col+1;
        if( i >= 0 && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // left + up
        i = row-1;
        j = col+2;
        if( i >= 0 && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // left + down
        i = row+1;
        j = col+2;
        if( i < n && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // down + right
        i = row+2;
        j = col+1;
        if( i < n && j < n && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // down + left
        i = row+2;
        j = col-1;
        if( i < n && j >= 0  && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // right + up
        i = row-1;
        j = col-2;
        if( i >= 0 && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);

        // right + down
        i = row+1;
        j = col-2;
        if( i < n && j >= 0 && grid[i][j] == num+1) return isValid(grid, i, j, num+1);
        return false;
    }
}
