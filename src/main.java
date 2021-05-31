public class main {
    public static void main(String[] args) {
      Filiaal filiaal = new Filiaal(1);
      Medewerker Paul = new Medewerker("Paul",41,1,"Leidinggevende");
      Medewerker Johan = new Medewerker("Johan",18,2,"Vakkenvuller");
      Zuivel Melk = new Zuivel("Melk",1.29,"31-05-2021");
      Brood volkoren = new Brood("Volkoren",1.80,"30-05-2021");
      Kass kass = new Kass();

      kass.addKasinhoud(200.29);
      kass.delKasinhoud(50.71);
      System.out.println(kass.toString());

      filiaal.inKlokken(Johan);
      filiaal.inKlokken(Paul);
      System.out.println(Paul.toString());
      filiaal.uitKlokken(Johan);
      System.out.println(Johan.toString());

      System.out.println(Melk.getPrijs());
      System.out.println(volkoren.getPrijs());
      System.out.println(Melk.getDatumGekoeld());
      System.out.println(volkoren.getDatumGebakken());
    }

}
