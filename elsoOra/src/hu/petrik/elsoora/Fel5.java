package hu.petrik.elsoora;

import java.util.Scanner;

public class Fel5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg a téglalap 'b' oldalát: ");
        double b = Double.parseDouble(sc.nextLine().replace(',','.'));
        sc.nextLine();
        System.out.print("Kérem adja meg, hogy mit szeretne kiszámítani (K: Kerület T:Terület): ");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")) {
            double ker = 2 * (a + b);
            System.out.printf("A téglalap kelulete: %.2f cm ", ker);
        }else if (muvelet.equals("T")){
            double ter = a * b;
            System.out.printf("A téglalap területe: %.2f cm^2",ter);
        }else{
            System.out.println("Hibás muveletet adott meg.");
        }
        if (a == b){
            System.out.println("\nA megadott téglalap egy négyzet.");
        }
    }
}
