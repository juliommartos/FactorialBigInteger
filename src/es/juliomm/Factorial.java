package es.juliomm;

import java.math.BigInteger;

public class Factorial {
    private BigInteger product;
    private BigInteger result;
    private BigInteger factorial;

    Factorial() {
        factorial = new BigInteger("1");
    }

    public BigInteger calcFactorial() {
        result = new BigInteger( "0" );
        product = new BigInteger( "0" );
        factorial = factorial.add(BigInteger.ONE);

        result = result.add(factorial).subtract(BigInteger.ONE);
        product = product.add(factorial);

        while (product.compareTo(BigInteger.ONE) > 0) {
            result = result.multiply(product);
            product = product.subtract(BigInteger.ONE);
        }

        return result;
    }

    public BigInteger getFactorial() {
        return factorial;
    }

}