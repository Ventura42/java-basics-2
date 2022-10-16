package pl.edu.wszib.app.zad1;
/**
 * Zadanie:
 * Utwórz enum RodzajSmaku zawierający wartości:
 * Troskawkowy
 * Bananowy
 * Szpinakowy
 * Ciasteczkowy
 * Jabłkowy
 * enum powinien przechowywać dodatkowo informację o poziomie słodkości
 * (int (albo enum jak ktoś bardzo chce),
 * poziomy do ustalenia według indywidualnych preferencji)
 *
 * A następnie zmodyfikować interfejs Smakowalne
 * tak aby zwracał RodzajSmaku i dostosować resztę programu
 *
 */
public enum RodzajTruskawki {
    ANANASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie"),
    ;

    private final String cecha;

    RodzajTruskawki(final String cecha) {
        this.cecha = cecha;
    }

    public String cecha() {
        return cecha;
    }

}
