package Backtracking;

import java.util.Scanner;

public class UniquePath2Direction {
    public static int maze(int sr,int sc,int er,int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er && sc == ec) return 1;
        int rightways = maze(sr,sc+1,er,ec);
        int downways = maze(sr+1,sc,er,ec);
        return rightways+downways;
    }
    public static void main(String[] args){
        int row,column;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: " );
        row = sc.nextInt();

        System.out.print("Enter column: ");
        column = sc.nextInt();

        int ways = maze(1,1,row,column);
        System.out.println("Total ways to reach the path is : "+ways);

    }
}
