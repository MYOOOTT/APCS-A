public class Project5_3 {
    private int numerator;
    private int denominator;

    public Project5_3(int n, int d) {
        if(d == 0) {
            d = 1;
        }

        if(d < 0) {
            n = n * (-1);
            d = d * (-1);
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

    public Project5_3 reciprocal() {
        return new Project5_3(denominator, numerator);
    }

    public Project5_3 add (Project5_3 frac2) {
        int d = denominator * frac2.getDenominator();
        int n1 = numerator * frac2.getDenominator();
        int n2 = frac2.getNumerator() * denominator;
        int sum = n1 + n2;
        return new Project5_3(sum, d);
    }

    public Project5_3 subtract (Project5_3 frac2) {
        int d = denominator * frac2.getDenominator();
        int n1 = numerator * frac2.getDenominator();
        int n2 = frac2.getNumerator() * denominator;
        int difference = n1 - n2;
        return new Project5_3(difference, d);
    }

    public Project5_3 multiply (Project5_3 frac2) {
        int n = numerator * frac2.getNumerator();
        int d = denominator * frac2.getDenominator();
        return new Project5_3(n, d);
    }

    public Project5_3 divide(Project5_3 frac2) {
        return multiply(frac2.reciprocal());
    }

    public String toString() {
        String result;

        if(numerator == 0) {
            result = "0";
        }
        else {
            if(denominator == 1) {
                result = numerator + "";
            }
            else {
                result = numerator + "/" + denominator;
            }
        }

        return result;
    }

    private void reduce() {
        if(numerator != 0) {
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