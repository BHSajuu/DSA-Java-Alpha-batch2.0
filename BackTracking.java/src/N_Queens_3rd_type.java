import java.util.*;
public class N_Queens_3rd_type {
    public static boolean isSafe(char board[][],int row,int col){
        // vertically upward
           for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q')
                    return false;
           }
        // diagonal left up
           for(int i=row-1,j=col-1; i>=0 && j>=0 ; i--,j--){
              if(board[i][j]=='Q')
                  return false;
           }
        // diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length ; i--,j++){
            if(board[i][j]=='Q')
                return false ;
        }
        return true;
    }
    public static boolean n_queens(char board[][],int row){
        // base case 
        if(row == board.length ){
            return true;
        }
        //kaam
        for(int j=0; j<board.length ; j++){
             if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(n_queens(board, row+1)){
                    return true;
                }
                board[row][j]='x';
             }
        }
        return false ;
    } 
    public static void print_cheass_board(char board[][]){
        System.out.println("________chess Board_________");
        for(int i=0; i<board.length ; i++){
           for(int j=0; j<board.length ; j++){
            System.out.print(board[i][j] +" ");
           }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.print("enter the  value of N = ");
       int n = s.nextInt();
       char board[][]=new char[n][n];
       for(int i=0; i<n ; i++)
           for(int j=0; j<n ; j++)
               board[i][j]='x';
        if(n_queens(board, 0)){
            System.out.println("solution is possible ");
            print_cheass_board(board);
        }
        else 
        System.out.println("solution is not possible ");
    }
}