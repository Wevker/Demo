package 集合类;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Emp {
    int id;
    String name;

    public Emp (int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class UseMap {
    public static void main(String[] args) {
        Emp e1 = new Emp(1, "XiaoLe");
        Emp e2 = new Emp(2, "XiaoZhan");
        Map<Integer, Emp> map = new HashMap<>();
        map.put(e1.id, e1);
        map.put(e2.id, e2);
        System.out.println(map.keySet());
        System.out.println(map.get(1).name);
        System.out.println(map.get(2).name);
    }
}
