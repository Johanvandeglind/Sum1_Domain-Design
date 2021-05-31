import java.util.ArrayList;

public class Filiaal implements Aanwezige{
    Medewerker leidinggevende;
    Integer filiaaNummer;
    ArrayList<Integer> Aanwezige = new ArrayList<>();

    public Filiaal(Integer filiaaNummer) {
        this.filiaaNummer = filiaaNummer;
    }

    public Medewerker getLeidinggevende() {
        return leidinggevende;
    }

    public void setLeidinggevende(Medewerker leidinggevende) {
        if (leidinggevende.getFunctie() == "Leidinggevende"){
            this.leidinggevende = leidinggevende;
        }
        else{
            System.out.println("Medewerker kan geen leidinggevende zijn van dit filiaal omdat zijn/haar funcite dit niet is");
        }

    }

    @Override
    public String toString() {
        return "Filiaal{" +
                "Aanwezige=" + Aanwezige +
                '}';
    }

    @Override
    public void inKlokken(Medewerker medewerker) {
        Aanwezige.add(medewerker.getID());
    }

    @Override
    public void uitKlokken(Medewerker medewerker) {

        Aanwezige.remove(Aanwezige.indexOf(medewerker.getID()));
    }
}
