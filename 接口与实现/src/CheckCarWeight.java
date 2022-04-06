public class CheckCarWeight {
    public static void main(String[] args) {
        ComputeWeight[] goods = new ComputeWeight[650];
        for (int i = 0; i < goods.length; i++) {
            if (i % 3 == 0)
                goods[i] = new Computer();
            else if (i % 3 == 1)
                goods[i] = new Television();
            else if (i % 3 == 2)
                goods[i] = new WashMachine();
        }
        Truck truck = new Truck(goods);
        System.out.printf("货车装载的货物重量:%-8.5f kg\n", truck.getTotalWeight());
//        goods = new ComputeWeight[68];
    }
}

interface ComputeWeight{
    public double computeWeight();
}

class Television implements ComputeWeight {
    @Override
    public double computeWeight() {
        return 3.5;
    }
}

class Computer implements ComputeWeight {
    @Override
    public double computeWeight() {
        return 5;
    }
}

class WashMachine implements ComputeWeight {
    @Override
    public double computeWeight() {
        return 10;
    }
}

class Truck {
    ComputeWeight[] goods;
    double totalWeight = 0;

    Truck(ComputeWeight[] goods) {
        this.goods = goods;
    }

    public void setGoods(ComputeWeight[] goods) {
        this.goods = goods;
    }

    public double getTotalWeight() {
        totalWeight = 0;
        for (ComputeWeight good: this.goods) {
            totalWeight = totalWeight + good.computeWeight();
        }
        return totalWeight;
    }
}