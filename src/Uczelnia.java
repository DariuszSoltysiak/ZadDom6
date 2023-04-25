public class Uczelnia {
    private String identyfikator;
    private String nazwa;
    private String miejscowosc;
    private String opis;

    public Uczelnia() {

    }

    public Uczelnia(String identyfikator, String nazwa, String miejscowosc, String opis) {
        this.identyfikator = identyfikator;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
        this.opis = opis;
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public String getOpis() {
        return opis;
    }

    public void setId(String identyfikator) {
        this.identyfikator = identyfikator;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return "Uczelnia{" +
                "id=" + identyfikator +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
