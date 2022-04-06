public class Experiment1 {
    // 输出希腊字母表
    public static void main(String[] args) {
        int start = 'α';
        int end = 'ω';
        int count = 1;
        System.out.println("希腊字母表如下：");
        for(int i=start;i<=end;i++,count++){
            System.out.print((char)i+"  ");
            if(count % 5 == 0) System.out.println();
        }
    }
}
