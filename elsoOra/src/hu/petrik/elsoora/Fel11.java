package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy pozitív egész számot: ");
        int szam = sc.nextInt();
        int ossz = 0;
        while(szam>0){
            if (szam % 2 != 0){
                ossz += szam;
            }
            szam--;
        }
        System.out.printf("A N-nél nem nagyobb páratlan számok összege %d",ossz);
    }
}
