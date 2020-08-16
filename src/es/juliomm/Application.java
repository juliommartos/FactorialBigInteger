package es.juliomm;

import java.math.BigInteger;
import java.util.Scanner;

public class Application extends Factorial {
    BigInteger numberToCompare;
    BigInteger numberToExceed;

    public Application() {
        super();
        numberToCompare = new BigInteger( "0" );
        numberToExceed = new BigInteger( "0" );
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        numberToExceed  = scanner.nextBigInteger();
        scanner.close();
        check();
    }

    public void check() {
        while ( numberToCompare.compareTo( numberToExceed ) < 0 ) {
            numberToCompare = calcFactorial();
        }

        System.out.println("The smallest factorial is " + getFactorial());
    }
}
