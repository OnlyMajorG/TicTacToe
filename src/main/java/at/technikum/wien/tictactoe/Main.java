package at.technikum.wien.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        
        System.out.println("Willkommen beim Tic-Tac-Toe Spiel!");
        
        while (playAgain) {
            TicTacToe game = new TicTacToe();
            game.start();
            
            boolean gameRunning = true;
            while (gameRunning) {
                // Implementierung des Spielablaufs hier
                // (wird in User Stories später detailliert)
                
                // Vorübergehend zum Testen:
                gameRunning = false;
            }
            
            System.out.println("Möchtest du noch einmal spielen? (J/N)");
            String answer = scanner.nextLine().trim().toUpperCase();
            playAgain = answer.equals("J");
        }
        
        System.out.println("Danke fürs Spielen!");
        scanner.close();
    }
}
