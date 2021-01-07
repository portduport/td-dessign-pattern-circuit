package CircuitDeCourse;

public class VoitureDuChampionnatDeFormuleUnFactory {
    public static VoitureDuChampionnatDeFormuleUn getVoiture(ConstructeurBrand brand){
        if(ConstructeurBrand.mercedes.equals(brand)) {
            System.out.println("Vous avez une Mercedes F1");
            return new Mercedes();
        }
        else if(ConstructeurBrand.ferrari.equals(brand)) {
            System.out.println("Vous avez une Ferrari F1");
            return new Ferrari();
        }
        else if(ConstructeurBrand.renault.equals(brand)) {
            System.out.println("Vous avez une Renault F1");
            return new Renault();
        }
        else
            throw new IllegalArgumentException();
    }
}
