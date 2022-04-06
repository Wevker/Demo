import java.util.Scanner;
public class Test1 {
    public static int f(int num1, int num2) throws MyException{
        if (num1 < 0 || num2 < 0){
            throw new MyException("参与计算的数需要大于等于0。");
        }
        int num3 = num1 + num2;
        return num3;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        try {
            System.out.println(f(num1, num2));
        }
        catch (MyException e){
            System.out.println(e.getMassage());
        }
    }
}
