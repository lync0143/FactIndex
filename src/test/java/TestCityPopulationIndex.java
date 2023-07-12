import org.example.CityPopulationIndex;
import org.example.FactIndex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCityPopulationIndex {
    @Test
    public void testGetKansasCityPopulation() {
        FactIndex cityPops = new CityPopulationIndex();
        assertEquals(500000, cityPops.getFact("Kansas City"));
    }
}
