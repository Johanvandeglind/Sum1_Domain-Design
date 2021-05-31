public class Artikel {
    String Naam;
    Double Prijs;

    public Artikel(String naam, Double prijs) {
        Naam = naam;
        Prijs = prijs;
    }

    public String getNaam() {
        return Naam;
    }

    public Double getPrijs() {
        return Prijs;
    }
}
