package Recursion;

public class MazePathDeadCells {
    public static void main(String[] args) {
        int[][] maze = {{0,0,0},
                {0,1,0},
                {0,0,0}};
        int row = maze.length;
        int col = maze[0].length;

        maze(0,0,row-1,col-1,"",maze);
    }
    public static void maze(int sr,int sc,int er,int ec,String path,int[][] maze){
        if(sr > er || sc > ec) return;
        if(sr < 0 || sc < 0) return;

        if(sr == er && sc == ec){
            System.out.println(path);
            return;
        }
        if(maze[sr][sc] == 1) return;

        maze(sr,sc+1,er,ec,path+"R",maze);

        maze(sr+1,sc,er,ec,path+"D",maze);

    }
}
