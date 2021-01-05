import CircuitDeCourse.ConstructeurBrand;
import CircuitDeCourse.Ferrari;
import CircuitDeCourse.VoitureDuChampionnatDeFormuleUn;
import CircuitDeCourse.VoitureDuChampionnatDeFormuleUnFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VoitureFactoryTest {
    private void assertExecutor(VoitureDuChampionnatDeFormuleUn executor){
        executor.accelerer();
        executor.freiner();
        executor.tourner();
        executor.getColor();
    }

    @Test
    public void testJerez(){
        VoitureDuChampionnatDeFormuleUn executor = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(ConstructeurBrand.ferrari);
        assertTrue(executor instanceof Ferrari);
        assertExecutor(executor);
    }
}
