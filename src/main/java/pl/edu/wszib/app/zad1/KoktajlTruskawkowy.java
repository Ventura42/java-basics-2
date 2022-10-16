package pl.edu.wszib.app.zad1;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {
    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        String message = String.format("Pije koktajl %s, która cechuje się %s", smak().opis(), rodzajTruskawki.cecha());
        System.out.println("Pije koktajl " + smak().opis() + ", która cechuje się " + rodzajTruskawki.cecha());
        System.out.println(message);
    }

    @Override
    public RodzajSmaku smak() {
        return RodzajSmaku.TRUSKAWKOWY;
    }
}
