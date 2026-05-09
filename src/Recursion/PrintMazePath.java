package Recursion;

public class PrintMazePath {
    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        maze(1,1,row,column,"");

    }
    public static void maze(int sr,int sc,int er,int ec,String path){
        if(sr > er || sc > ec) return;
        if(sr == er && sc == ec){
            System.out.println(path);
            return;
        }
        maze(sr+1,sc,er,ec,path+"D");
        maze(sr,sc+1,er,ec,path+"R");
    }
}
