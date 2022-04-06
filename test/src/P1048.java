import java.util.Scanner;

public class P1048 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        int M = reader.nextInt();
        int[][] data = new int[M+1][2];
        int[] ans = new int[T+1];

        for(int i=1;i<=M;i++){
            for(int j=1;j<=T;j++){
                if(j >= data[i][0]){
                    ans[j] = Math.max(ans[j], ans[j-data[i][0]] + data[i][1]);
                }
            }
            for(int x:ans){
                System.out.print(x+" ");
            }
        }

    }
}
