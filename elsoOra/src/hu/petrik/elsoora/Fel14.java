package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg szót:");
        String bekert = sc.next();
        System.out.print("Mit szeretne kezdeni a szöveggel? \n" +
                "a, Nagy betűssé alakítani\n" +
                "b, Kisbetűssé alakítani\n" +
                "c, Lekérdezni a hosszát\n" +
                "d, Összehasonlítani egy másik stringel (string2 bekérése)\n" +
                "e, Egy részét kiiratni a Stringnek (a, b intervallum bekérése)\n" +
                "f, Kilépni\n");
        String betu = sc.next();
        while (betu != "f"){
            if (betu.equals("a")){
                String big = bekert.toUpperCase();
                System.out.printf("A szó a %s lett \n",big);
            } else if (betu.equals("b")) {
                String small = bekert.toLowerCase();
                System.out.printf("A szó a %s lett \n",small);
            } else if (betu.equals("c")) {
                int hossz = bekert.length();
                System.out.printf("A szó hossza %d karakter \n",hossz);
            } else if (betu.equals("d")) {
                System.out.print("Kérem adjon meg még egy szót \n");
                String masodik = sc.next();
                int elso = bekert.length();
                int masod = masodik.length();
                System.out.printf("Az első szó %d karakter hosszú a második szó pedig %d karakter hosszú",elso ,masod);
            } else if (betu.equals("e")) {
                System.out.println("Hányadik karaktertől szeretné?");
                int tol = sc.nextInt();
                System.out.println("Hányadik karakterig szeretné kiírni?");
                int mennyi = sc.nextInt();
                String bontott = bekert.substring(tol, mennyi);
                System.out.printf("A bontott szó a(z) %s .\n",bontott);
            } else if (betu.equals("f")) {
                System.out.print("Kilépés...");
                break;
            }else{
                System.out.print("Rossz betűt adott meg.");
            }
            System.out.print("Mit szeretne kezdeni a szöveggel? \n" +
                    "a, Nagy betűssé alakítani\n" +
                    "b, Kisbetűssé alakítani\n" +
                    "c, Lekérdezni a hosszát\n" +
                    "d, Összehasonlítani egy másik stringel (string2 bekérése)\n" +
                    "e, Egy részét kiiratni a Stringnek (a, b intervallum bekérése)\n" +
                    "f, Kilépni\n");
            betu = sc.next();
        }
    }

}
