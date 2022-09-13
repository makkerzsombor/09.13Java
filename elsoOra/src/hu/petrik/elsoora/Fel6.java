package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a dolgozata eredményét: ");
        int ered = sc.nextInt();
        if (ered>87){
            System.out.println("A dolgozata jeles");
        }else if (ered>72){
            System.out.println("A dolgozata jó");
        }else if (ered>57){
            System.out.println("A dolgozata közepes");
        } else if (ered>42) {
            System.out.println("A dolgozata elégséges");
        }else{
            System.out.println("A dolgozata elégtelen");
        }
    }
}
