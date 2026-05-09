package Backtracking;

public class MazePath2 {
    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        int[][] maze = {{0,0,0},
                        {0,1,0},
                        {0,0,0}};

        boolean[][] isVisited = new boolean[row][column];

        maze(0,0,row-1,column-1,"",isVisited);

    }
    public static void maze(int sr,int sc,int er,int ec,String path,boolean[][] isVisited){
        if(sr > er || sc > ec) return;
        if(sr < 0 || sc < 0) return;
        if(isVisited[sr][sc]) return;
        if(sr == er && sc == ec){
            System.out.println(path);
            return;
        }
        isVisited[sr][sc] = true;
        maze(sr,sc-1,er,ec,path+"L",isVisited);
        maze(sr,sc+1,er,ec,path+"R",isVisited);
        maze(sr-1,sc,er,ec,path+"U",isVisited);
        maze(sr+1,sc,er,ec,path+"D",isVisited);
        isVisited[sr][sc] = false;

    }
}
