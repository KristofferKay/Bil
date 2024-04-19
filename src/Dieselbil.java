public class Dieselbil extends Bil {
    private boolean harPartikelfilter;
    private int kmPrl;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrl) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrl = kmPrl;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public int getKmPrl() {
        return kmPrl;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public void setKmPrl(int kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrl=" + kmPrl +
                '}';
    }
    // For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også afhængig af kmPrL. Hvis den er mellem 20 og 50 er udligningsafgiften 130kr, mellem 15 og 20 er den 1390 kr, mellem 10 og 15 er den 1850kr, mellem 5 og 10 er den 2770kr,  og under 5 er den 15260kr. Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter monteret.

    public double beregnGrønEjerafgift(){
        if (kmPrl >= 20 || kmPrl <=50 ) {
            return kmPrl = 330-130;
        } else if (kmPrl >= 15 || kmPrl <=20) {
            return kmPrl = 1050-1390;
        } else if (kmPrl == 10 || kmPrl <= 10) {
            return kmPrl=2340-1850;
        } else if (kmPrl >= 5 || kmPrl <=10) {
            return kmPrl = 5500-2770;
        } else if (kmPrl >=5) {
            return kmPrl =10470-15260;
        } if (harPartikelfilter == true){
            return  kmPrl = 1000;
        }
        return kmPrl;
    }

}
