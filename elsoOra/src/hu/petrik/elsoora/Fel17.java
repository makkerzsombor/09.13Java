package hu.petrik.elsoora;

import java.util.concurrent.ThreadLocalRandom;

public class Fel17 {
    public static void main(String[] args) {
        double[] array1 = new double[5];
        double[] array2 = new double[5];
        double[] array3 = new double[5];
        for (int i = 0; i < 5; i++) {
            array1[i] = ThreadLocalRandom.current().nextDouble(-100, 100 + 1);
            array2[i] = ThreadLocalRandom.current().nextDouble(-100, 100 + 1);
        }
        for (int i = 0; i < 5; i++) {
            array3[i] = array1[i] + array2[i];
            System.out.printf("A harmadik tömb %d -ik eleme: %f ",i+1,array3[i]);
        }
    }
}
