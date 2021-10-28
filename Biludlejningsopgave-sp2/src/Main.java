public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage("Betül's garage");

        garage.addBil(new Benzinbil("AD12345", "BMW", "X5", 2021, 5, 95, 19.4));
        garage.addBil(new Dieselbil("AB12345", "Audi", "Q7", 2021, 5, true, 16.1));
        garage.addBil(new Elbil("AC12345", "Tesla", "Model S", 2021, 5, 70, 637, 191));

        System.out.println(garage);
        System.out.println("Den samlede afgift er: " + garage.beregnGrønAfgiftForBilpark());
    }
}
