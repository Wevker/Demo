package 动物声音模拟器;

public class Dog extends Animal{
    @Override
    void cry() {
        System.out.println("汪汪汪！！！");
    }

    @Override
    String getAnimalName() {
        String s = "我是一只小狗";
        return s;
    }
}
