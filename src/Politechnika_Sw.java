public class Politechnika_Sw extends Uczelnia {
    private String kierunki;

    public Politechnika_Sw() {

    }

    public Politechnika_Sw(String identyfikator, String nazwa, String miejscowosc, String opis, String kierunki) {
        super(identyfikator, nazwa, miejscowosc, opis);
        this.kierunki = kierunki;
    }

    public void setKierunki(String kierunki) {
        this.kierunki = kierunki;
    }

    public String getKierunki() {
        return kierunki;
    }

    @Override
    public String toString() {
        return "Kierunki na naszej Politechnice: \nKierunek - Malarstwo" + "\nKierunek - Rzezba" +
                "\nKierunek - Grafika" + "\nKierunek - Rysunek";
    }
}
