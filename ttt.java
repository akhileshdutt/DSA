import java.util.Scanner;
public class ttt{
    public static void main(String[] args) {
        char[][] board = new char[3][3];
    for(int row=0; row<board.length; row++){
        for(int col=0; col<board[row].length; col++){
            board[row][col] = ' ';
        }
    }
    char player = 'X';
    boolean gameOver = false;

    Scanner scanner = new Scanner(System.in);

    while(!gameOver){
        printboard(board);
        System.out.print("Player " + player + ", enter your move (row and column): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        if(board[row][col] == ' '){
            board[row][col] = player;
            gameOver = haveOne(board, player);
            if(gameOver){
                printboard(board);
                System.out.println("Player " + player + " wins!");
            } else {
                if(player == 'X'){
                    player = 'O';
                } else {
                    player = 'X';
                }
            } 

        } else {
            System.out.println("Invalid, Try again.");
        }
        // printboard(board);
    }
    }
    public static void printboard(char[][] board){
        for(int row=0; row<board.length; row++){
        for(int col=0; col<board[row].length; col++){
            System.out.print(" | "+board[row][col] + " | ");
        }
        System.out.println();
    }
    }

    public static boolean haveOne( char[][] board, char player){
       // chack rows
       for(int row=0; row<board.length; row++){
        if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
            return true;
        }
       }
         // check cols
        for(int col=0; col<board[0].length; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }
        // check diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
}
