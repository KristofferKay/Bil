public class Elbil extends Bil{
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrkm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrkm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrkm = whPrkm;
    }
    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }


    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrkm(int whPrkm) {
        this.whPrkm = whPrkm;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrkm() {
        return whPrkm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm" + maxKm +
                ", whPrkm=" + whPrkm +
                '}';
    }

        // For en Elbil gælder de samme regler som for benzinbilen, blot skal man først omregne whPrKm til kmPrL. Det gøres ved at dividere whPrKm med 91,25 og dernæst dividere 100 med dette tal.
        public double beregnGrønEjerafgift(){
            int kmPrl = whPrkm/91/100;
            if (kmPrl >= 20 || kmPrl <=50 ) {
                return kmPrl = 330;
            } else if (kmPrl >= 15 || kmPrl <=20) {
                return kmPrl = 1050;
            } else if (kmPrl == 10 || kmPrl <= 10) {
                return kmPrl=2340;
            } else if (kmPrl >= 5 || kmPrl <=10) {
                return kmPrl = 5500;
            } else if (kmPrl >=5) {
                return kmPrl =10470;
            }
            return kmPrl;
        }
}
