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
        // Zadanie:
        // Przy użyciu switch statement oraz switch expression (jedna metoda zakomentowana)
        // do sformatowanej wiadomości dodaj
        // na podstawie rodzaju smaku informację o tym czy smak jest: OWOCOWY, WARZYWNY czy INNY
        // informacja ta powinna pochodzić z nowej metody zrodloSmaku,
        // która zwraca nowy enum ZrodloSmaku.
        // Metoda ta powinna zostać umieszczona w klasie KoktajlSmakowy
        String message = String.format(
                "Pije koktajl %s, która cechuje się %s",
                smak(),
                rodzajTruskawki
        );
//        System.out.println("Pije koktajl " + smak().opis() + ", która cechuje się " + rodzajTruskawki.cecha());
        System.out.println(message);
    }
}
