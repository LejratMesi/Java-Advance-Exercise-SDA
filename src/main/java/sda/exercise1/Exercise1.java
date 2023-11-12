package sda.exercise1;

import java.util.Scanner;

/*
Shkruani nje aplikacion qe
krahason bashkesine e numrave tek me ate cift ne nje array qe vlerat e tij jepen nga perdoruesi
*/
public class Exercise1 {
    public static void main(String[] args) {
        //Krijojme variablen Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni gatesine e bashkesise se numrave");
        int arrayLength = input.nextInt();
        int numberArray[] = new int[arrayLength];

        //Popullimin e Array
        for (int i = 0; i < numberArray.length; i++){
            System.out.println("Vendosni numrin tek pozicioni " + i);
            numberArray[i] = input.nextInt();
        }

        krahasoTekCift(numberArray);

    }

    private static void krahasoTekCift(int[] numberArray) {
        int nrTek = 0, nrCift = 0;

        for (int i = 0; i< numberArray.length ; i++){
            if(numberArray[i] % 2 == 0){
                nrCift++;
            } else {
                nrTek++;
            }
        }

        if(nrCift == nrTek){
            System.out.println("Numrat cift dhe tek jane te barabarte");
        } else if (nrCift > nrTek){
            System.out.println("Numrat cift jane me shume se numrat tek");
        } else {
            System.out.println("Numrat tek jane me shume se numrat cift");
        }
    }
}
