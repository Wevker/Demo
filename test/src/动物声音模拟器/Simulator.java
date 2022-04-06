package 动物声音模拟器;

public class Simulator {
    public void playSound(Animal animal) {
        System.out.println(animal.getAnimalName());
        animal.cry();
    }
}
