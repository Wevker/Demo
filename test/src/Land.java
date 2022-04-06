public class Land {
    public static void main(String[] args) {
        Village.setWaterAmount(200);
        int leftWater = Village.waterAmount;
        System.out.println("水井中有" + leftWater + "升水");
        Village zhaoJiaZhuang, maJiaHeZi;
        zhaoJiaZhuang = new Village("赵家庄");
        maJiaHeZi = new Village("马家河子");
        zhaoJiaZhuang.setPeopleNumber(80);
        maJiaHeZi.setPeopleNumber(120);
        zhaoJiaZhuang.drinkWater(50);
//        Village.drinkWater(50);     error用法 无法从静态上下文中引用非静态方法
        leftWater = zhaoJiaZhuang.lookWaterAmount();
        maJiaHeZi.drinkWater(100);
        maJiaHeZi.lookWaterAmount();
        System.out.println("赵家庄的人口为：" + zhaoJiaZhuang.peopleNumber);
        System.out.println("马家河子的人口为：" + maJiaHeZi.peopleNumber);
    }
}
