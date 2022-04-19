package FileIO流;

import java.io.*;

public class FileIOTest {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        File file = new File("G:\\IntelliJ IDEA Community Edition 2021.3.2\\javaproject\\test\\src\\FileIO流\\test.txt");
        byte[] bytes = "我正在测试文件字节输入输出流".getBytes();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes);
        fos.close();
        System.out.println("文件写入成功");

        FileInputStream fis = new FileInputStream(file);
        byte[] bytes1 = new byte[1024];
        int len = fis.read(bytes1);
        System.out.println(new String(bytes1, 0, len));
        System.out.println("文件读取成功");
        fis.close();

        FileWriter fw = new FileWriter(file);
        fw.write("我正在测试文件字符输入输出流");
        fw.close();
        System.out.println("文件写入成功");

        FileReader fr = new FileReader(file);
        char[] chars = new char[1024];
        int len1 = fr.read(chars);
        System.out.println(new String(chars, 0, len1));
        System.out.println("文件读取成功");
        fr.close();
    }
}
