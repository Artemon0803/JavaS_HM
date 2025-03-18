package hm4;

import java.util.Scanner;

public class TTTDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.println("Welcome to TicTacToe game!\nFirst turn as: O");
        game.fieldShow();
        do{
            System.out.print("Enter x position: ");
            x=scanner.nextInt();
            System.out.print("Enter y position: ");
            y=scanner.nextInt();
            game.userTurn(x, y);
            game.fieldShow();
        } while(!game.gameOver());
        System.out.println("Game Over!");
        System.out.println(game.checkWinner());
    }
}
