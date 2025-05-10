package at.technikum.wien.tictactoe;

public class TicTacToe {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;
    
    public TicTacToe() {
        // Initialisierung
        player1 = new Player('X');
        player2 = new Player('O');
        currentPlayer = player1;
        board = new Board();
    }
    
    public void start() {
        // Spiel starten
        board.clear();
        currentPlayer = player1;
    }
    
    public void switchCurrentPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
    
    public boolean hasWinner() {
        // Prüfe auf Gewinner (wird später implementiert)
        return false;
    }
}
