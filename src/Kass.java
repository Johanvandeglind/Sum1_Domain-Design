public class Kass {
    Double kassInhoud = 0.00;
    public void addKasinhoud(Double bedrag){
        kassInhoud += bedrag;
    }
    public void delKasinhoud(Double bedrag){
        kassInhoud -= bedrag;
    }

    @Override
    public String toString() {
        return "Kass{" +
                "kassInhoud=" + kassInhoud +
                '}';
    }
}
