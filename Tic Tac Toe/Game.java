package TicTacToe;
import java.util.*;

public class Game {
    
    Player [] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;

    public Game(Player [] players, Board board){

        this.players=players;
        this.board=board;
        this.turn=0;
        this.noOfMoves=0;
        this.gameOver=false;

        StringBuilder z = new StringBuilder();
        StringBuilder c = new StringBuilder();

        for(int i=0;i<board.size;i++){
            z.append('0');
            c.append('X');
        }

        zero = z.toString();
        cross = c.toString();

    }

    public void printBoard(){
        for(int i=0;i<board.size;i++){
            for(int j=0;j<board.size;j++){
                System.out.print(board.board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void play(){
        printBoard();
        int n=board.size;

        while(!gameOver){
            noOfMoves++;
            int idx = getIndex();

            int row =idx/n;
            int col = idx%n;

            board.board[row][col]=players[turn].getSymbol();
            if(noOfMoves >= n*n) {
                System.out.println("Game Draw");
                return;

            }

            if(noOfMoves >=  2*n-1 && checkCombinations() == true){
                gameOver = true;
                printBoard();
                System.out.println("Winner is : "+ players[turn].getName());
                return ;
            }

            turn =(turn +1)%players.length;
            printBoard();

        }
    }

    public int getIndex(){
        while(true){
            
            System.out.println("Player: "+ players[turn].getName() +" give one position");
            Scanner scn = new Scanner(System.in);

            int pos= scn.nextInt()-1;
            int n=board.size;
            int row=pos/n, col=pos%n;

            if(row<0 || col <0 || row>=n || col >=n){
                System.out.println("Invalid position");
                continue;
            }

            if(board.board[row][col]!='-'){
                System.out.println("Position already occupied");
                continue;
            }
            return pos;

        }


    }

    public boolean checkCombinations(){
        
        int n=board.size;

        //  Row wise
        for(int i=0;i<n;i++){
            StringBuilder sb =new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board.board[i][j]);
            }
            String pattern =sb.toString();

            if(pattern.equals(zero) || pattern.equals(cross)){
                return true;
            }
        }


        // ColumnWise

        for(int i=0;i<n;i++){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(board.board[j][i]);
            }

            String pattern =sb.toString();

            if(pattern.equals(zero)  || pattern.equals(cross)){
                return true;
            }
        }

        // Diagonal 

        StringBuilder sb= new StringBuilder();

        int i=0,j=0;
        while(i<n){
            sb.append(board.board[i][j]);
            i++;
            j++;
        }

        
        String pattern =sb.toString();

        if(pattern.equals(zero) || pattern.equals(cross)){
            return true;
        }

        // Anti Diagonal
        sb= new StringBuilder();

         i=0;
         j=n-1;
        while(i<n){
            sb.append(board.board[i][j]);
            i++;
            j--;
        }

         pattern =sb.toString();

        if(pattern.equals(zero) || pattern.equals(cross)){
            return true;
        }

        return false;

    }

}
