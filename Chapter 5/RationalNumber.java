public class RationalNumber
{
    private int numerator;
    private int denominator;

    public RationalNumber (int n, int d) {
        if (d == 0)
            d = 1;

        //make the numberator "store" the sign
        if (d < 0) {
            n = n * -1;
            d = d * -1;

        }

        numerator = n;
        denominator = d;

        reduce();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //returns the reciprocal of this rational number
    public RationalNumber reciprocal() {
        return new RationalNumber (denominator, numerator);
    }

    //adds this rational number to another one passed as a parameter
    public RationalNumber add(RationalNumber r2) {
        int d = denominator * r2.getDenominator();
        int n1 = numerator * r2.getDenominator();
        int n2 = r2.getNumerator() * denominator;
        int sum = n1 + n2;
        return new RationalNumber (sum, d);
    }

    public RationalNumber subtract(RationalNumber r2) {
        int d = denominator * r2.getDenominator();
        int n1 = numerator * r2.getDenominator();
        int n2 = r2.getNumerator() * denominator;
        int difference = n1 - n2;
        return new RationalNumber (difference, d);
    }

    public RationalNumber multiply (RationalNumber r2) {
        int n = numerator * r2.getNumerator();
        int d = denominator * r2.getDenominator();
        return new RationalNumber(n, d);
    }

    public RationalNumber divide(RationalNumber r2) {
        return multiply(r2.reciprocal());
    }

    public boolean equals (RationalNumber r2) {
        return(numerator == r2.getNumerator() &&
            denominator == r2.getDenominator());
    }

    public String toString() {
        String result;

        if(numerator == 0) {
            result = "0";
        }
        else {
            if (denominator == 1){
                result = numerator + "";
            }
            else {
                result = numerator + "/" + denominator;
            }
        }

        return result;
    }

    private void reduce() {
        if (numerator != 0) {
            int commonDivisor = gcd(Math.abs(numerator), denominator);
            numerator = numerator / commonDivisor;
            denominator = denominator / commonDivisor;
        }
    }

    private int gcd(int num1, int num2) {
        while(num1 != num2) {
            if(num1 > num2) {
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }

        return num1;
    }
}
