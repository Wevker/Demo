import java.util.Scanner;
public class SquareEquation {

    double a, b, c;
    double root1, root2;
    double k;
    boolean bool;

    SquareEquation(double num1, double num2, double num3){
        a = num1;
        b = num2;
        c = num3;
    }

    public boolean getBool(){
        k = b * b - 4 * a * c;
        if(k >= 0){
            bool = true;
            System.out.println(a+"x^2 + "+b+"x + "+c+"此方程有实数根。");
        }
        else{
            bool = false;
            System.out.println(a+"x^2 + "+b+"x + "+c+"此方程没有实数根。");
        }
        return bool;
    }

    public double[] getRoot(){
        getBool();
        if(bool){
            root1 = -(b + Math.sqrt(k)) / (2 * a);
            root2 = -(b - Math.sqrt(k)) / (2 * a);
            System.out.println(a + "x^2 + "+b+"x + "+c+"的实数根为:" + root1 + ", " + root2);
        }
        return new double[]{root1, root2};
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入二次项系数:");
        double num1 = reader.nextDouble();
        System.out.println("请输入一次项系数:");
        double num2 = reader.nextDouble();
        System.out.println("请输入常数项系数:");
        double num3 = reader.nextDouble();
        SquareEquation equation1 = new SquareEquation(num1, num2, num3);
        equation1.getRoot();
    }
}
