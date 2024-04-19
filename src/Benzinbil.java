public class Benzinbil extends Bil {

    private int oktantal;
    private int kmPrl;

    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.kmPrl = kmPrl;
        this.oktantal = oktantal;
    }

    public int getkmPrl() {
        return kmPrl;
    }

    public int getOktantal() {
        return oktantal;
    }

    public int setKmPrl() {
        return kmPrl;
    }

    public int setOktanAntal() {
        return oktantal;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrl=" + kmPrl +
                '}';
    }

    public double beregnGrønEjerafgift(){
        if (kmPrl >= 20 || kmPrl >=50 ) {
            return kmPrl = 330;
        } else if (kmPrl >= 15 || kmPrl >=20) {
            return kmPrl = 1050;
        } else if (kmPrl == 10 || kmPrl >= 10) {
            return kmPrl=2340;
        } else if (kmPrl >= 5 || kmPrl >=10) {
            return kmPrl = 5500;
        } else if (kmPrl >=5) {
            return kmPrl =10470;
        }
       return kmPrl;
   }
}

    //For en Benzinbil er afgiften afhængig af kmPrL. Hvis den er mellem 20 og 50 er den 330kr, mellem 15 og 20 er den 1050 kr, mellem 10 og 15 er den 2340kr, mellem 5 og 10 er den 5500kr,  og under 5 er den 10470kr.



