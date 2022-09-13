package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a tippjét (0-fej || 1-írás): ");
        int tipp = sc.nextInt();
        // Véletlen egész szám a és b között (int)(Math.random() = (b - a + 1)) + a
        int feldob = (int)(Math.random() * 2);
        System.out.printf("A dobás eredménye %s", (feldob == 0) ? "fej" : "írás");
    }
}
