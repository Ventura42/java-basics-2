package pl.edu.wszib.app.zad1;

public class KoktajlTruskawkowy extends KoktajlSmakowy {
    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        String message = String.format("Pije koktajl %s, która cechuje się %s", smak(), rodzajTruskawki);
//        System.out.println("Pije koktajl " + smak().opis() + ", która cechuje się " + rodzajTruskawki.cecha());
        System.out.println(message);
    }
}
