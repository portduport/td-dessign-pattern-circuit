package CircuitDeCourse;

public class VoitureDuChampionnatDeFormuleUnFactory {
    public static VoitureDuChampionnatDeFormuleUn getVoiture(ConstructeurBrand brand){
        if(ConstructeurBrand.mercedes.equals(brand))
            return new Mercedes();
        else if(ConstructeurBrand.ferrari.equals(brand))
            return new Ferrari();
        else if(ConstructeurBrand.renault.equals(brand))
            return new Renault();
        else
            throw new IllegalArgumentException();
    }
}
