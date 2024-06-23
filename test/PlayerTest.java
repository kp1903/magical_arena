import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player(50, 5, 10);
    }

    @Test
    public void testPlayerInitialization() {
        assertEquals(50, player.getHealth());
        assertTrue(player.isAlive());
    }

    @Test
    public void testPlayerAttack() {
        Player defender = new Player(100, 10, 5);
        player.attack(defender);
        assertTrue(defender.getHealth() < 100);
    }

    @Test
    public void testPlayerDefend() {
        player.defend(30);
        assertTrue(player.getHealth() < 50);
    }
}