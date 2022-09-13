package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy valós számot: ");
        double szam = sc.nextDouble();
        System.out.printf("A megadott szám a %f és a %f egész számok között van, és ezek közül a %d számhoz van közelebb.",Math.floor(szam),Math.ceil(szam),Math.round(szam));

    }
}
