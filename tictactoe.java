import java.util.Arrays;
import java.util.Scanner;

public class tictactoe {
    static String board[];
    static String turn;
    static void THEBOARD(){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");
    }
    static String ISWINNER() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2]; //123
                    break;
                case 1:
                    line = board[3] + board[4] + board[5]; //456
                    break;
                case 2:
                    line = board[6] + board[7] + board[8]; //789
                    break;
                case 3:
                    line = board[0] + board[4] + board[8]; //159
                    break;
                case 4:
                    line = board[2] + board[4] + board[6]; //357
                    break;
                case 5:
                    line = board[0] + board[3] + board[6]; //147
                    break;
                case 6:
                    line = board[2] + board[5] + board[8]; //369
                    break;
                case 7:
                    line = board[1] + board[4] + board[7]; //258
                    break;
            }
            if (line.equals("xxx")) {
                return "x";
            } else if (line.equals("ooo")) {
                return "o";
            }
        }
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(i + 1))) {
                break;
            }
            else if(i==8){
                return "draw";
            }
        }
        System.out.println(turn + "'s turn : ");
        return null;
    }
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe Game");
        System.out.println("x's turn :");
        String winner = null;
        turn = "x";
        Scanner scanner = new Scanner(System.in);
        //setting up the board
        board = new String[9];
        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i+1);
        }
        THEBOARD();

        //playing game
        while (winner==null) {
            int numberChosen = scanner.nextInt();
            if (numberChosen > 9 || numberChosen < 1) {
                System.out.println("Only within 1-9 range");
                continue;
            }
            if (board[numberChosen - 1].equals(String.valueOf(numberChosen))) {
                board[numberChosen - 1] = turn;
                //rotate the turn
                if (turn.equals("x")) {
                    turn = "o";
                } else {
                    turn = "x";
                }
                THEBOARD();
                winner = ISWINNER(); //o, x, draw
            } else {
                System.out.println("slot is taken, choose another slot");
            }
        }
        if (winner.equals("draw")){
                System.out.println("game is draw. thanks for playing!");
            }
        else{
                System.out.println("Congratulations " + turn+ " YOU WON");
            }
    }
}
