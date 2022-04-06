public class 各数据类型的精度 {
    public static void main(String[] args) {
        System.out.println("Byte:" + Byte.SIZE);
        System.out.println("Short:" + Short.SIZE);
        System.out.println("Char:" + Character.SIZE);
        System.out.println("Int:" + Integer.SIZE);
        System.out.println("Long:" + Long.SIZE);
        System.out.println("Float:" + Float.SIZE);
        System.out.println("Double:" + Double.SIZE);
        System.out.println(2^4);   // 2:0010
                                   // 4:0100
                                   // 6:0110
        int num = 'a';
        System.out.println(num);
    }
}
