import java.util.ArrayList;

public class Garage {

    private String garageName;
    private ArrayList<Bil> biler;

    public Garage(String garageName){
        this.garageName = garageName;
        biler = new ArrayList<>();
    }

    public void addBil(Bil nyBil){
      biler.add(nyBil);
    }

    @Override
    public String toString() {
        return "I bilparken kan du finde: " + "\n" + biler;
    }

    public double beregnGrønAfgiftForBilpark(){
        double samletAfgift = 0;
        for(Bil b : biler){
            samletAfgift += b.beregnGrønEjerafgift();
        }
        return samletAfgift;
    }
}
