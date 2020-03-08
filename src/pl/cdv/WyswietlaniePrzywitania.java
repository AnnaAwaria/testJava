package pl.cdv;

public class WyswietlaniePrzywitania {

    public static void main(String[] args) {
        String hejka = przywitanie("Ania", "Frania");
        System.out.println(hejka);

    }

    public static String przywitanie(String imie, String nazwisko) {
        return "Jestem " +imie + " " + nazwisko;
    }
}
