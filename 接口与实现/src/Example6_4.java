import java.util.Scanner;

public class Example6_4 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        System.out.println("当前的士的空调温度为：" + taxi.AirTemperature);
        taxi.controlAirTemperature(22);
        System.out.println("当前的士的空调温度为：" + taxi.AirTemperature);
        taxi.Break();
        taxi.charge();

        bus.Break();
        bus.charge();
    }
}

abstract class MotorVehicles {
    abstract void Break();
}

interface CAT {
    void controlAirTemperature(int number);
}

interface Charge {
    void charge();
}

class Taxi extends MotorVehicles implements CAT, Charge {
    int AirTemperature = 26;
    int fee = 1;

    @Override
    void Break() {
        System.out.println("正在刹车！");
    }

    @Override
    public void controlAirTemperature(int number) {
        this.AirTemperature = number;
    }

    @Override
    public void charge() {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入您的路程时间：");
        int time = reader.nextInt();
        System.out.printf("此车的费用为%d元每分钟", this.fee);
        System.out.printf("收您%d元\n", this.fee * time);
    }
}

class Bus extends MotorVehicles implements Charge {

    @Override
    void Break() {
        System.out.println("正在刹车！");
    }

    @Override
    public void charge() {
        System.out.println("城区上车，收您2元钱，祝您一路平安！");
    }
}
