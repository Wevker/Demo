import java.util.Scanner;
public class Experiment3 {
    // 从键盘键入一个数（1~9999999）并判断是否其是否是回文数
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = reader.nextInt();
        if(judge(number)){
            System.out.printf("%d是回文数\n", number);
            System.out.println("其长度为："+String.valueOf(number).length());
        }
        else {
            System.out.printf("%d不是是回文数\n", number);
            System.out.println("其长度为："+String.valueOf(number).length());
        }
    }
    public static boolean judge(int num){
        String s = String.valueOf(num);
        char[] char_lis = s.toCharArray();
        int n = char_lis.length;
        for(int i=0;i<n/2;i++) {
            if (char_lis[i] != char_lis[n - 1 - i]) return false;
        }
        return true;
    }
}
