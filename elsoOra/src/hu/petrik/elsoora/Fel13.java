package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Véletlen egész szám a és b között (int)(Math.random() = (b - a + 1)) + a
        int random = (int)(Math.random() * 100) + 1;
        System.out.println("A gép gondolt egy számra 1 és 100 között.");
        System.out.print("Próbálja meg kitalálni a számot 1 és 100 között: ");
        int szam = sc.nextInt();
        while(random != szam){
            if (szam > random){
                System.out.println("A gondolt szám kisebb.");
            }else{
                System.out.println("A gondolt szám nagyobb.");
            }
            System.out.println("Kérem adjon meg egy másik számot 1 és 100 között: ");
            szam = sc.nextInt();
        }
        System.out.printf("Gratulálok kitalálta a számot. A szám %d volt.",random);
    }
}
