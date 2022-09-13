package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int szam =1001;
        while(szam > 1000 || szam < 1){
        System.out.print("Kérem adjon meg egy összeget, ami maximum 1000 Ft:");
        szam = sc.nextInt();
        }
        int penzerme = 0;
        while(szam > 4){
            while (szam >= 200){
                szam = szam - 200;
                penzerme++;
            }
            while(szam >= 100){
                szam = szam - 100;
                penzerme++;
            }
            while(szam >= 50){
                szam = szam - 50;
                penzerme++;
            }
            while(szam >= 20){
                szam = szam - 20;
                penzerme++;
            }
            while(szam >= 10){
                szam = szam - 10;
                penzerme++;
            }
            while(szam >= 5){
                szam = szam - 5;
                penzerme++;
            }
        }
        System.out.println("Jó számot adott meg.");
        System.out.printf("Ezt az értéket legkevesebb %d érmével lehet kifizetni",penzerme);
        if (szam>0){
        System.out.printf("\nTovábbá maradt %d Forint, amit nem tudunk pénzérmével kifizetni.", szam );
        }

    }
}
