package pl.edu.wszib.app.zad1;

public abstract class KoktajlSmakowy extends Koktajl implements Smakowalne {
    private final RodzajSmaku rodzajSmaku;

    public KoktajlSmakowy(final int kcal,
                          final RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}
