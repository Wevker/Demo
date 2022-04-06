package 集合类;
import java.util.*;

public class UseListAndSet {
    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= 100; i++) {
            lis.add(i);
            set.add(i % 10);
        }

        int j = 0;
        System.out.println("lis中的元素如下:");
        for (int num: lis) {
            if (j % 10 == 0 && j != 0)
                System.out.println();
            System.out.print(num + "\t");
            j++;
        }

        j = 0;
        System.out.println("\nset中的元素如下:");
        for (int num: set) {
            if (j % 10 == 0 && j != 0)
                System.out.println();
            System.out.print(num + "\t");
            j++;
        }
        System.out.println("set.size:" + set.size());
    }
}
