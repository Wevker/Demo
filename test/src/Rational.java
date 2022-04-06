public class Rational {
    int numerator;
    int denominator;

    public Rational(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("分母不能为0。");
            System.exit(0);
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void setNumeratorAndDenominator(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public String toString(){
        if (denominator == 1)
            return Integer.toString(numerator);
        else if (numerator == 0)
            return "0";
        else
            return numerator + "/" + denominator;
    }

    public static int GreatestCommonFactor(int numerator, int denominator){
        int temp;
        if (numerator < denominator){
            temp = numerator;
            numerator = denominator;
            denominator = temp;
        }

        while (true){
            int res = numerator - denominator;
            if (res == 0){
                return numerator;
            }
            else {
                numerator = Math.max(res, denominator);
                denominator = Math.min(res, denominator);
            }
        }
    }

    public static Rational add(Rational a, Rational b){
        int common_numerator = a.numerator * b.denominator + b.numerator * a.denominator;
        int common_denominator = a.denominator * b.denominator;
        int k = GreatestCommonFactor(common_numerator, common_denominator);
        common_numerator = common_numerator / k;
        common_denominator = common_denominator / k;
        return new Rational(common_numerator, common_denominator);
    }

    public static Rational sub(Rational a, Rational b){
        int common_numerator = a.numerator * b.denominator - b.numerator * a.denominator;
        int common_denominator = a.denominator * b.denominator;
        int k = GreatestCommonFactor(common_numerator, common_denominator);
        common_numerator = common_numerator / k;
        common_denominator = common_denominator / k;
        return new Rational(common_numerator, common_denominator);
    }

    public static Rational muti(Rational a, Rational b){
        int common_numerator = a.numerator * b.numerator;
        int common_denominator = a.denominator * b.denominator;
        int k = GreatestCommonFactor(common_numerator, common_denominator);
        common_numerator = common_numerator / k;
        common_denominator = common_denominator / k;
        return new Rational(common_numerator, common_denominator);
    }

    public static Rational div(Rational a, Rational b){
        int common_numerator = a.numerator * b.denominator;
        int common_denominator = a.denominator * b.numerator;
        int k = GreatestCommonFactor(common_numerator, common_denominator);
        common_numerator = common_numerator / k;
        common_denominator = common_denominator / k;
        return new Rational(common_numerator, common_denominator);
    }

    public static void main(String[] args) {
        Rational a = new Rational(1, 1);
        Rational b = new Rational(2, 4);
        Rational c = Rational.div(a, b);
        System.out.println(c.toString());
    }
}
