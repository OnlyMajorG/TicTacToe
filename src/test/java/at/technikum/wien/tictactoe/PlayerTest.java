package at.technikum.wien.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    
    @Test
    public void testPlayerCreation() {
        // Arrange & Act
        Player playerX = new Player('X');
        Player playerO = new Player('O');
        
        // Assert
        assertEquals('X', playerX.getMarker(), "Das Marker-Symbol für Spieler 1 sollte 'X' sein");
        assertEquals('O', playerO.getMarker(), "Das Marker-Symbol für Spieler 2 sollte 'O' sein");
    }
    
    @Test
    public void testDifferentMarkers() {
        // Arrange & Act
        Player player1 = new Player('X');
        Player player2 = new Player('O');
        
        // Assert
        assertNotEquals(player1.getMarker(), player2.getMarker(), 
                       "Die Marker von verschiedenen Spielern sollten unterschiedlich sein");
    }
    
    @Test
    public void testCustomMarker() {
        // Arrange & Act
        char customSymbol = '#';
        Player customPlayer = new Player(customSymbol);
        
        // Assert
        assertEquals(customSymbol, customPlayer.getMarker(), 
                    "Der Spieler sollte das angegebene benutzerdefinierte Symbol verwenden");
    }
}
