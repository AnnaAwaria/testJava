package pl.cdv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        /*String[] names = new String[3];
        System.out.println("Podaj imie 1: ");
        names[0]  = scanner.next();
        System.out.println("Podaj imie 2: ");
        names[1]  = scanner.next();
        System.out.println("Podaj imie 3: ");
        names[2]  = scanner.next();

        System.out.println(names[0] + " "+ names[1] + " " + names[2]);*/

        /*List<String> names = new ArrayList();
        System.out.println("Podaj imie 1: ");
        names.add(scanner.next());
        System.out.println("Podaj imie 2: ");
        names.add(scanner.next());
        System.out.println("Podaj imie 3: ");
        names.add(scanner.next());

        System.out.println(names.toString());*/

      /*  String[] names = new String[3];
        System.out.println("Podaj imie 1: ");
        names[0]  = scanner.next();
        System.out.println("Podaj imie 2: ");
        names[1]  = scanner.next();
        System.out.println("Podaj imie 3: ");
        names[2]  = scanner.next();

        for(int i=0; i<names.length;i++) {
            System.out.println(names[i]);
        }*/

      List<String> names = new ArrayList();

        int number;

        String name;
        do {
          System.out.println("Podaj imie: ");
          name = scanner.next();

            if(!name.equals("-")) {
                names.add(name);

            }else {
                System.out.println("Podaj zakres od 0");
                number = scanner.nextInt();
                System.out.println(names.get(number));
            }

        }
        while (!name.equals("-"));



    }


}

