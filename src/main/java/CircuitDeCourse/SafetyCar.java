package CircuitDeCourse;

public class SafetyCar {
    private static SafetyCar instance = new SafetyCar();

    public static SafetyCar getInstance() { return instance; }

    private SafetyCar(){

    }
}
