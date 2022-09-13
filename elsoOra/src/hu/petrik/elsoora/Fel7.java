package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adaja meg a hónap számát: ");
        int honapszam = sc.nextInt();
        if (honapszam >= 1 && honapszam < 3 | honapszam==12){
            System.out.println("Tél van.");
        } else if (honapszam > 2 && honapszam < 6) {
            System.out.println("Tavasz van.");
        } else if (honapszam > 5 && honapszam < 9 ){
            System.out.println("Nyár van.");
        }else{
            System.out.println("Ősz van.");
        }
    }
}
