package at.technikum.wien.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    private Board board;
    
    @BeforeEach
    public void setUp() {
        board = new Board();
    }
    
    @Test
    public void testIsCellEmpty() {
        assertTrue(board.isCellEmpty(0, 0), "Neue Zelle sollte leer sein");
        
        board.place(0, 0, 'X');
        assertFalse(board.isCellEmpty(0, 0), "Zelle sollte nach Platzierung nicht mehr leer sein");
    }
    
    @Test
    public void testPlace() {
        assertTrue(board.isCellEmpty(1, 1), "Zelle sollte initial leer sein");
        
        board.place(1, 1, 'O');
        assertFalse(board.isCellEmpty(1, 1), "Zelle sollte nach Platzierung nicht mehr leer sein");
    }
    
    @Test
    public void testClear() {
        board.place(0, 0, 'X');
        board.place(1, 1, 'O');
        
        board.clear();
        
        assertTrue(board.isCellEmpty(0, 0), "Zelle sollte nach Clear leer sein");
        assertTrue(board.isCellEmpty(1, 1), "Zelle sollte nach Clear leer sein");
    }
}
