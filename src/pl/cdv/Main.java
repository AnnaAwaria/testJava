package pl.cdv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello World");

        int age = 34;
        long value = 3000423111L;
        final float pi = 3.1415F;
        double e = 2.7182818284590D;
        boolean isMale = true;
        int weight = 85;
        final char letterA = 'a';

        String a = "Ale ładna pogoda";
        String b = "Ładnie maks";
        String c = "No super";
        int sum = a.length() + b.length() + c.length();

        System.out.println(a + " " + a.length());
        System.out.println(b + " " + b.length());
        System.out.println(c + " " + c.length());
        System.out.println(sum);*/

      /*  int resultValue = 3 + 5 * 4 - 10 * 2;
        System.out.println(resultValue);*/
      Scanner scanner = new Scanner(System.in);
      System.out.println("Podaj liczbę: ");
      int number = scanner.nextInt();

      boolean greaterThan10 = number > 10;
      boolean is0 = number == 0;
      boolean lowerThan50 = number < 50;
      boolean is20 = number >= 20;
      boolean is30 = number <= 30;
      boolean not5 = number != 5;

      System.out.println("wiecej niz 10 " + greaterThan10);
      System.out.println("0 " + is0);
      System.out.println("mniej niz 50 "+ lowerThan50);
      System.out.println("wieksza rowna 20 " + is20);
      System.out.println("mniejsza rowna 30 " + is30);
      System.out.println("nie 5 " + not5);


    }
}
