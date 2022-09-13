package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.printf("Kérem íjra be a(z) %d -ik elemét.",i+1);
            int szam=sc.nextInt();
            t[i]=szam;
        }
        System.out.println("\nMegadási sorrend:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("A tömb %d -ik eleme a %d ",i+1,t[i]);
        }
        System.out.println("\nFordított sorrend: ");
        for (int i = 4; i > 0 ; i--) {
            System.out.printf("A tömb %d -ik eleme a %d ",i+1,t[i]);
        }
        System.out.println("\nA tömb minden második eleme: ");
        for (int i = 0; i < 5; i+=2) {
            System.out.printf("A tömb %d -ik eleme: %d ",i+1,t[i]);
        }
        System.out.print("\n Kérem adja meg, hogy hányadik elemet szeretné kiíratni.");
        int elem = sc.nextInt();
        System.out.printf("A tömb %d -ik eleme: %d ",elem,t[elem-1]);
    }
}
