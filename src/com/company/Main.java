package com.company;

public class Main {
    public static void main(String[] args) {
        // Crearea unui tort cu 6 lumânări. Dimensiunea fiecărei lumânări este de [1, 2, 2, 4, 4, 4].
        birthdayCakeCandles(6, 1, 2, 2, 4, 4, 4);
    }

    /**
     * Creeam un tort. Primul parametru este cantitatea de lumânări de pe tort.
     * Parametrii dați după aceea sunt înălțimea fiecărei lumânări de pe tort.
     *
     * @param lightCandleCount
     * @param lights
     */

    public static void birthdayCakeCandles(int lightCandleCount, int... lights) {
        // Verificam dacă parametrii dați se încadrează în limitele 1 și 10 ^ 3. Dacă este adevărat atunci
        // returnează și arată error.
        if (lightCandleCount < 1 || lights.length < 1 || lightCandleCount > 1000 || lights.length > 1000) {
            System.err.println("Parametrii introdusi trebuie sa fie intre 1 si 1000");
            return;
        }

        // Verificam dacă matricea are suficiente valori întroduse
        if (lightCandleCount != lights.length) {
            System.err.println("Size of the lightcandles array doesn't match given amount of lightcandles");
            return;
        }

        // Găsim cel mai mare număr dintr-o matrice
        int largestNumber = findLargestNumber(lights);
        System.out.println("Largest/Tallest lightcandle on the cake is " + largestNumber);

        // Numărăm de câte ori este prezent cel mai mare număr din matrice
        int occurencesOfLargestNumber = countHowManyTimesNumberIsWrittenInTheArray(largestNumber, lights);
        System.out.println(
                "There are " + occurencesOfLargestNumber + " lightcandles on the cake with size " + largestNumber);
    }

    /**
     * Găsim cel mai mare număr dintr-o matrice
     *
     * @param intArray
     * @return int
     */
    public static int findLargestNumber(int[] intArray) {
        int largestInt = 0;

        for (int i : intArray) {
            if (i > largestInt) {
                largestInt = i;
            }
        }

        return largestInt;
    }

    /**
     *
     * Numărăm de câte ori este scris un număr în interiorul unei matrice de numere întregi
     *
     * @param findNumber
     * @param intArray
     * @return int
     */
    public static int countHowManyTimesNumberIsWrittenInTheArray(int findNumber, int[] intArray) {
        int repeatedNumber = 0;

        for (int i : intArray) {
            if (i == findNumber) {
                repeatedNumber = repeatedNumber + 1;
            }
        }

        return repeatedNumber;
    }
}
