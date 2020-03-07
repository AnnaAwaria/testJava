package pl.cdv;

import java.util.Scanner;

public class Klawiatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstvalue;
        float secondvalue;
        String inputText;

        System.out.println("Podaj liczbe calkowita: ");
        firstvalue = scanner.nextInt();
        System.out.println("Podaj liczbe zmiennoprzecinkowa: ");
        secondvalue = scanner.nextFloat();
        System.out.println("Podaj slowo: ");
        inputText = scanner.next();

        System.out.println("Pierwsza liczba to: " + firstvalue);
        System.out.println("Druga liczba to: " + secondvalue);
        System.out.println("Twój tekst to: " + inputText);
    }
}