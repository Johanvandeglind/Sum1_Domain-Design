public class Medewerker{
    String Naam;
    Integer Leeftijd;
    Integer ID;
    String Functie;
    Double Salaris;

    public Medewerker(String naam, Integer leeftijd, Integer ID, String functie) {
        Naam = naam;
        Leeftijd = leeftijd;
        this.ID = ID;
        Functie = functie;
    }

    public Double getSalaris() {
        return Salaris;
    }

    public void setSalaris(Double salaris) {
        Salaris = salaris;
    }

    public String getNaam() {
        return Naam;
    }

    public Integer getLeeftijd() {
        return Leeftijd;
    }

    public Integer getID() {
        return ID;
    }

    public String getFunctie() {
        return Functie;
    }

    @Override
    public String toString() {
        return "Deze medewerker heet: " +
                Naam + '\n' +
                "Zijn/haar leeftijd is: " + Leeftijd +
                " en het ID is:" + ID + " "+ Naam+
                "beoefend de functie:" + Functie +
                "en zijn salaris is" + Salaris;
    }
}
