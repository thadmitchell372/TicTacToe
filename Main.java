package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToeClass game = new TicTacToeClass();
        char player1 = 'X', player2 = 'O';

        while (true) {
            game.displayBoard();
            System.out.println("Turn " + game.getTurns());
            if (game.getTurns() % 2 != 0) {
                game.playMove(player1);
            } else {
                game.playMove(player2);
            }
            if (game.isWinner(player1)) {
                System.out.println("'" + player1 + "' wins the game!");
                break;
            } else if (game.isWinner(player2)) {
                System.out.println("'" + player2 + "' wins the game!");
                break;
            } else if (game.getTurns() > 9) {
                System.out.println("This game is a tie.");
                break;
            }

        }
    }
}
