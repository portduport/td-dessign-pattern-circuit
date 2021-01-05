package CircuitDeCourse;

public class CircuitDeCourse {
    public static void main(String[] args){
        SafetyCar mySafetycar = SafetyCar.getInstance();
        VoitureDuChampionnatDeFormuleUn numero1 = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(ConstructeurBrand.mercedes);
        VoitureDuChampionnatDeFormuleUn numero2 = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(ConstructeurBrand.ferrari);
        VoitureDuChampionnatDeFormuleUn numero3 = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(ConstructeurBrand.renault);
        VoitureDuChampionnatDeFormuleUn numero4 = VoitureDuChampionnatDeFormuleUnFactory.getVoiture(ConstructeurBrand.ferrari);
    }
}
