import org.example.FactIndex;
import org.example.StateSizeIndex;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStateSizeIndex {
    static FactIndex stateSizeIndex;
    @BeforeAll
    public static void setUp() {
        stateSizeIndex = new StateSizeIndex();
    }

    @Test
    public void testGetMissouriSize() {
        int missouriArea = 69715;
        assertEquals(missouriArea, stateSizeIndex.getFact("Missouri"));
    }

    @Test
    public void testGetKansasSize() {
        int kansasArea = 82278;
        assertEquals(kansasArea, stateSizeIndex.getFact("Kansas"));
    }

    @Test
    public void testGetArkansasSize() {
        int arkansasArea = 53179;
        assertEquals(arkansasArea, stateSizeIndex.getFact("Arkansas"));
    }

    @Test
    public void testGetArizonaSize() {
        int arizonaArea = 113998;
        assertEquals(arizonaArea, stateSizeIndex.getFact("Arizona"));
    }

    @Test
    public void testGetDelawareSize() {
        int delawareArea = 2498;
        assertEquals(delawareArea, stateSizeIndex.getFact("Delaware"));
    }

    @Test
    public void testGetNewYorkSize() {
        int newYorkArea = 54556;
        assertEquals(newYorkArea, stateSizeIndex.getFact("New York"));
    }

    @Test
    public void testThrowsInvalidStateException() {
        int errorValue = 0;
        assertEquals(errorValue, stateSizeIndex.getFact("Iowa"));
    }
}
