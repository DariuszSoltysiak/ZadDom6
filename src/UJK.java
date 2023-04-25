public class UJK extends Uczelnia {
    private String info_dziekanat;

    public UJK() {

    }

    public UJK(String identyfikator, String nazwa, String miejscowosc, String opis, String info_dziekanat) {
        super(identyfikator, nazwa, miejscowosc, opis);
        this.info_dziekanat = info_dziekanat;
    }

    public void setInfo_dziekanat(String info_dziekanat) {
        this.info_dziekanat = info_dziekanat;
    }

    public String getInfo_dziekanat() {
        return info_dziekanat;
    }

    @Override
    public String toString() {
        return "Informacje podstawowe o dziekanacie: " + info_dziekanat;
    }
}
