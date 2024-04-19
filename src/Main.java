public class Main {
    public static void main(String[] args) {

        //Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper af Bil. Tilføj bilerne til garagen. Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og skriv resultatet ud.
        Garage garage = new Garage();

        Bil benzinbil = new Benzinbil(123,"tesla","truck1",12,4,2,1);
        Bil elbil = new Elbil(123, "skodael","2332",2121,4,123,123123,4);
        Bil dieselbil= new Dieselbil(123, "skodael","2332",2121,4,true,10);

        garage.addCar(benzinbil);
        garage.addCar(elbil);
        garage.addCar(dieselbil);

        System.out.println(garage);

        System.out.println(benzinbil.beregnGrønEjerafgift()  + elbil.beregnGrønEjerafgift() + dieselbil.beregnGrønEjerafgift() );


    }
}
