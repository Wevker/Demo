public class InsertSort {
    public static void main(String[] args) {
        int[] lis = {43, 81, 19, 47, 34, 80, 79, 68, 85, 61, 92, 29, 50, 21, 13, 72, 94, 70, 2, 20, 58, 65, 89, 32, 39, 88, 23, 31, 41, 76, 1, 93, 10, 14, 59, 4, 48, 0, 9, 36, 69, 91, 82, 5, 53, 16, 74, 26, 35, 96, 97, 63, 77, 67, 90, 38, 30, 57, 73, 49, 45, 40, 54, 46, 75, 98, 7, 86, 25, 60, 18, 44, 55, 22, 62, 37, 87, 8, 3, 28, 17, 66, 71, 83, 6, 42, 95, 84, 64, 33, 12, 24, 15, 27, 56, 51, 99, 78, 11, 52};
        Sort(lis);
        for(int x:lis) System.out.print(" "+x);

    }
    public static void Sort(int[] lis){
        int n = lis.length;
        int tep;
        int j;
        for(int i = 1;i<n;i++){

            tep = lis[i];
            j = 0;
            int right = i;
            while (lis[i]>=lis[j] && j<i) j++;

            while (j<right) {
                lis[right] = lis[right - 1];
                right--;
            }

            lis[j] = tep;
            }
        }
}

