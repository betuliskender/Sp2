public abstract class Bil {

    private String regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    public Bil(String regNr, String mærke, String model, int årgang, int antalDøre){
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public abstract double beregnGrønEjerafgift();

    @Override
    public String toString() {
        return "mærke = " + mærke +
                ", model = " + model +
                ", regNr = " + regNr +
                ", årgang = " + årgang +
                ", antalDøre = " + antalDøre;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public String getModel() {
        return model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }
}
