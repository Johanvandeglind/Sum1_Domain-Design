public class Brood extends Artikel{
    String DatumGebakken;

    public String getDatumGebakken() {
        return DatumGebakken;
    }

    public Brood(String naam, Double prijs, String datumgebakken) {
        super(naam, prijs);
        this.DatumGebakken = datumgebakken;
    }

}
