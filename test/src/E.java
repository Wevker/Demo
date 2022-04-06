import java.util.*;
public class E {
    public static void main(String args[]) {
        char [] a = {'B','D','A'};
        char [] b = {'B','A','D'};
        boolean one = Arrays.equals(a,b);
        Arrays.sort(a);
        Arrays.sort(b);
        boolean two = Arrays.equals(a,b);
        System.out.printf("%b,%b",one,two);//【代码】
    }
}

