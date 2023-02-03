package Databaser;

public class Main {
    public static void main(String[] args) {
        FIlmarkiv2 fIlmarkiv = new FIlmarkiv2();
        Film film1 = new Film(1, "Leo", "Horeungen", 2002, Sjanger.KRIM, "Dosney");
        Film film2 = new Film(2, "Oliver", "Fittetyrnet", 2002, Sjanger.KRIM, "Dosney");
        Film film3 = new Film(3, "Neger", "NegerSlaven", 2002, Sjanger.KRIM, "Dosney");

        fIlmarkiv.leggTilFilm(film1);
        fIlmarkiv.leggTilFilm(film2);
        fIlmarkiv.leggTilFilm(film3);

        System.out.println(fIlmarkiv.antall());
        System.out.println(fIlmarkiv.finnFilm(2).getTittel());
    }
}
