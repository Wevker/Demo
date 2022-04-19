package Class类和反射;
import java.lang.reflect.*;

public class Example_02 {
    int i;
    public float f;
    protected boolean b;
    private String s;

    public static void main(String[] args) {
        Example_02 example = new Example_02();
        Class exampleC = example.getClass();
        // 获取所有的成员变量
        Field[] declaredFields = exampleC.getDeclaredFields();
        for (Field field : declaredFields) {
            // 遍历成员变量
            System.out.println("名称为:" + field.getName());
            Class fieldType = field.getType();
            System.out.println("类型为:" + fieldType);
            boolean isTurn = true;
            while (isTurn) {
                // 如果成员变量的访问权限为private，则抛出异常，即不允许访问
                try {
                    isTurn = false;
                    // 获取成员变量值
                    System.out.println("修改前的值为:" + field.get(example));
                    if (fieldType.equals(int.class)) {
                        System.out.println("利用方法setInt()修改成员变量的值");
                        field.setInt(example, 168);
                    } else if (fieldType.equals(float.class)) {
                        System.out.println("利用方法setFloat()修改成员变量的值");
                        field.setFloat(example, 99.9f);
                    } else if (fieldType.equals(boolean.class)) {
                        System.out.println("利用方法setBoolean()修改成员变量的值");
                        field.setBoolean(example, true);
                    } else {
                        System.out.println("利用方法set()修改成员变量的值");
                        field.set(example, "MWQ");
                    }
                    // 获取成员变量的值
                    System.out.println("修改后的值为:" + field.get(example));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("在设置成员变量值时抛出异常，" + "下面执行setAccessible()方法");
                    field.setAccessible(true);   // 设置为允许访问
                    isTurn = true;
                }
            }
            System.out.println();
        }
    }
}
