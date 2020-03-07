package pl.cdv;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        /*boolean isEvenNumber = number % 2 == 0;

        if(isEvenNumber) {
            System.out.println("Liczba jest parzysta");

        }else {
            System.out.println("Liczba jest nieparzysta");
        }*/

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;

        if(isPositive) {
            System.out.println("Liczba jest dodatnia");
        }else if(isNegative) {
            System.out.println("Liczba jest ujemna");
        }else {
            System.out.println("Liczba to zero");
        }


    }
}
