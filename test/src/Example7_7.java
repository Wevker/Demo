import java.util.Scanner;
public class Example7_7 {
    public static void main(String[] args) {
        int[] score = {-120, 98, 89, 120, 99};
        int sum = 0;
        for (int number:score){
            assert number >= 0:"成绩不能为负数。";
            sum += number;
        }
        System.out.println("总人数为:" + score.length);
        System.out.println("总分为:" + sum);
    }
}
