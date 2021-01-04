import CircuitDeCourse.SafetyCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SafetyCarTest {
    @Test
    void testSingleton(){
        SafetyCar firstSafetyCar = SafetyCar.getInstance();
        SafetyCar secondSafetyCar = SafetyCar.getInstance();
        assertEquals(firstSafetyCar, secondSafetyCar);
    }
}
