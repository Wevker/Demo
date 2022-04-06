package 动物声音模拟器;

public class Cat extends Animal{
    @Override
    void cry() {
        System.out.println("喵喵喵！！！");
    }

    @Override
    String getAnimalName() {
        String s = "我是一只小猫。";
        return s;
    }
}
