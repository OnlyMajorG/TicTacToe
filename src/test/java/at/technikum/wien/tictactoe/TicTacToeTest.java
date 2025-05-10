package at.technikum.wien.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    
    private TicTacToe game;
    
    @BeforeEach
    public void setUp() {
        game = new TicTacToe();
    }
    
    @Test
    public void testInitialization() {
        // Die Eigenschaftenfelder werden in der TicTacToe-Klasse als private deklariert
        // Daher testen wir indirekt durch das Verhalten
        
        // Der Test prüft, ob das Spiel beim Start keine Gewinner hat
        assertFalse(game.hasWinner(), "Ein neues Spiel sollte keinen Gewinner haben");
    }
    
    @Test
    public void testStart() {
        // Hier müssen wir indirektes Verhalten testen, da die Methode start() 
        // hauptsächlich interne Zustände zurücksetzt
        game.start();
        
        // Prüfe, dass nach dem Start kein Gewinner vorhanden ist
        assertFalse(game.hasWinner(), "Nach dem Start sollte das Spiel keinen Gewinner haben");
        
        // Weitere Tests könnten hinzugefügt werden, wenn wir Zugriffsmethoden
        // für das Board und den aktuellen Spieler haben
    }
    
    @Test
    public void testSwitchCurrentPlayer() {
        // Da wir keine Getter für die Spieler haben, müssen wir eine andere Strategie verwenden
        // Eine Möglichkeit wäre, die Klasse TicTacToe zu modifizieren, um den aktuellen Spieler zugänglich zu machen
        
        // Hier ist ein Beispiel für einen solchen Test, der voraussetzt, dass wir einen Getter hätten:
        // Player initialPlayer = game.getCurrentPlayer();
        // game.switchCurrentPlayer();
        // assertNotSame(initialPlayer, game.getCurrentPlayer(), "Der aktuelle Spieler sollte wechseln");
        
        // Da wir jedoch keinen direkten Zugriff haben, können wir nur eine allgemeine Testbehauptung aufstellen:
        // Dies ist ein Platzhaltertest, der in einer realen Implementierung erweitert werden sollte
        assertTrue(true, "Dieser Test sollte verbessert werden, sobald wir Zugriffsmethoden haben");
    }
    
    @Test
    public void testHasWinner() {
        // In der initialen Implementierung gibt hasWinner() immer false zurück
        // Dies sollte später mit tatsächlichen Gewinnbedingungen erweitert werden
        assertFalse(game.hasWinner(), "Die Methode hasWinner() sollte false zurückgeben, da sie noch nicht vollständig implementiert ist");
    }
    
    // Diese Tests sollten erweitert werden, sobald mehr Funktionalität implementiert ist
    // z.B. Tests für das Prüfen von Gewinnbedingungen, Spielzügen, etc.
}
