public class Main {
    public static void main(String[] args) {

        Politechnika_Sw politechnikaSw = new Politechnika_Sw("Politechnika", "Politechnika Samych Wazniakow", "Ikarowo",
                "Polibuda to nie nuda",
                "Kierunek - Malarstwo " + "Kierunek - Rzezba" + "Kierunek - Grafika" + "Kierunek - Rysunek");
        System.out.println("Identyfikator uczelni: " + politechnikaSw.getIdentyfikator());
        System.out.println("Nazwa uczelni: " + politechnikaSw.getNazwa());
        System.out.println("Miejscowosc:" + politechnikaSw.getMiejscowosc());
        System.out.println("Opis uczelni: " + politechnikaSw.getOpis());
        System.out.println(politechnikaSw);
        System.out.println();

        UJK ujk = new UJK("Uniwersytet", "Uniwersytet Jana Kana", "Marki", "Uniwersytet dla wrazliwych",
                " Dziekanat czynny pon-pt, 10-12.");
        System.out.println("Identyfikator uczelni: " + ujk.getIdentyfikator());
        System.out.println("Nazwa uczelni: " + ujk.getNazwa());
        System.out.println("Miejscowosc: " + ujk.getMiejscowosc());
        System.out.println("Opis uczelni: " + ujk.getOpis());
        System.out.println(ujk);

    }
}