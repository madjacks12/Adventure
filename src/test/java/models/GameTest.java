package models;
import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void runGame_instanceWorks() {
        Game testGame = new Game("a");
        assertEquals(true, testGame instanceof Game);
    }

    @Test
    public void runGame_getsOutput_a() {
        Game testGame = new Game("a");
        assertEquals("a", testGame.getOutput());
    }
}
