package 动物声音模拟器;

public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        Dog dog = new Dog();
        Cat cat = new Cat();
        simulator.playSound(dog);
        simulator.playSound(cat);
    }
}
