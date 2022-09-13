package hu.petrik.elsoora;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Fel15 {
    public static void main(String[] args) {
        Random r = new Random();
        int min = -100;
        int max = 100;
        double[] tomb = new double[25];
        for (int i = 0; i < 25; i++){
            tomb[i] = ThreadLocalRandom.current().nextDouble(min, max + 1);
        }
        for (int i = 0; i<25; i++){
            if (i%2==0){
                System.out.printf("%s: %f\n",(i+1),tomb[i]);
            }
        }
    }
}
