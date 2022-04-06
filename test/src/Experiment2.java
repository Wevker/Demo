import java.util.Arrays;
public class Experiment2 {
    // 数组的遍历与复制
    public static void main(String[] args) {
        int[] lis = new int[10];
        for(int i=0;i<10;i++) lis[i] = i;
        int[] lis2 = Arrays.copyOf(lis, 5);
        int[] lis3 = Arrays.copyOfRange(lis, 2, 8);
        System.out.println("数组lis元素如下：");
        show_arrays(lis);
        System.out.println("数组lis2元素如下：");
        show_arrays(lis2);
        System.out.println("数组lis3元素如下：");
        show_arrays(lis3);
        System.out.println(5/2);
    }

    public static void show_arrays(int[] lis) {
        for(int x:lis) System.out.print(x+" ");
        System.out.println();
    }
}
