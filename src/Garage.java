import java.util.ArrayList;

public  class Garage {

    // Der skal være en klasse der hedder Garage, som har en ArrayList der kan indeholde biler. Garageklassen skal have et navn, samt en metode til at tilføje biler til bilparken. Den skal override toString, sådan at den skriver alle de biler ud der holder i garagen. Den skal også have en metode der hedder beregnGrønAfgiftForBilpark() der beregner den samlede grønne afgift for alle bilerne i garagen.
    ArrayList<Bil> garage = new ArrayList<>();
    Bil bil;
    String navn = "Min Garage";



    public void addCar(Bil bil) {
        garage.add(bil);
    }
    public double beregnGrønAfgiftForBilpark(){
        bil.beregnGrønEjerafgift();
        return bil.beregnGrønEjerafgift();
    }


    @Override
    public String toString() {
        return "Garage{" +
                "bil=" + bil +
                ", navn='" + garage + '\'' +
                '}';
    }
}
