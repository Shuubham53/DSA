package Backtracking;

public class UniquePath3 {
    public static int ans=0;
    public static void main(String[] args) {

        int[][] grid = {{1,0,0,0},
                        {0,0,0,0},
                        {0,0,2,-1}};


        int remaining = 0;
        int sc = 0;
        int sr = 0;
        int ec = 0;
        int er = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != -1){
                    remaining++;
                }
                if(grid[i][j] == 1){
                    sr = i;
                    sc = j;
                }
                if(grid[i][j] == 2){
                    er = i;
                    ec = j;
                }
            }
        }

        maze(sr,sc,er,ec,grid,remaining);
        System.out.println(ans);
    }
    public static void maze(int sr,int sc,int er,int ec,int[][] isVisited,int remaining){
        if(sr >= isVisited.length || sc >= isVisited[0].length) return;
        if(sr < 0 || sc < 0) return;
        if(isVisited[sr][sc] == -1) return;



        if(sr == er && sc == ec){
            if(remaining == 1){
                ans++;
            }
            return;

        }
        int temp = isVisited[sr][sc];
        isVisited[sr][sc] = -1;

        maze(sr,sc-1,er,ec,isVisited,remaining-1);
        maze(sr,sc+1,er,ec,isVisited,remaining-1);
        maze(sr-1,sc,er,ec,isVisited,remaining-1);
        maze(sr+1,sc,er,ec,isVisited,remaining-1);
        isVisited[sr][sc] = temp;

    }
}
