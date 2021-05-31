public class Zuivel extends Artikel{
    String DatumGekoeld;

    public String getDatumGekoeld() {
        return DatumGekoeld;
    }

    public Zuivel(String naam, Double prijs, String datumgekoeld) {
        super(naam, prijs);
        this.DatumGekoeld = datumgekoeld;
    }

}
