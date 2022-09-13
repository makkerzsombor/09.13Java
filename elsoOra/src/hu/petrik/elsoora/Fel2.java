package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a fal szélességét méterben: ");
        double szel = sc.nextDouble();
        System.out.print("Kérem adja meg a fal magaságát méterben: ");
        double mag = sc.nextDouble();
        double falter = szel * mag;
        System.out.print(Math.ceil(falter/0.04)+"db csempe kellene de a +10% miatt "+Math.ceil((falter/0.04)*1.1)+"db csempe fog kelleni. ");
    }
}
