import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum_t = reader.nextInt();
        int n = reader.nextInt();
        int[][] data = new int[n][2];
        for(int i=0;i<n;i++){
            data[i][0] = reader.nextInt();
            data[i][1] = reader.nextInt();
        }
        int[][] ans = new int[101][101];
        show(ans);
        for(int i=1;i<101;i++){
            for(int j=1;j<101;j++){
                if(j<data[0][0]) ans[0][j] = 0;
                else{
                ans[i][j] = max(ans[i-1][j], ans[i-1][j-data[i][0]]+data[i][1]);
            }}
        }
        show(ans);
        // show(data);

    }
    public static void show(int[][] lis){
        for(int[] k:lis){
            for(int x:k){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static int max(int a, int b){
        return Math.max(a, b);
    }
}
