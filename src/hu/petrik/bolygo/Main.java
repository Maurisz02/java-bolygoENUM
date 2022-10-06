package hu.petrik.bolygo;

import hu.petrik.bolygo.bolygo.Bolygo;

public class Main {
    public static void main(String[] args) {

        for(Bolygo b : Bolygo.values()){
            System.out.printf("%15s - %35f - %20f\n",b,b.getTomeg(),b.getSugar());
        }

        int sulyAFoldon = 100;
        int tomeg = (int) (sulyAFoldon / Bolygo.FOLD.getGravitacio());

        for(Bolygo b : Bolygo.values()){
            System.out.printf("100kg a %15s - %f\n", b, b.getSuly(tomeg));
        }

    }
}
