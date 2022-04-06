public class Village {
    static int waterAmount;
    int peopleNumber;
    String name;

    Village(String s){
        name = s;
    }

    static void setWaterAmount(int num){
        if(num > 0)
            waterAmount = num;
    }

    void drinkWater(int num){
        if(waterAmount - num >= 0) {
            waterAmount = waterAmount - num;
            System.out.printf("%s喝了%d升水。\n", name, num);
        }
        else{
            waterAmount = 0;
            System.out.println(name + "把剩下的" + waterAmount + "升水喝完了。");
        }
    }

    int lookWaterAmount(){
        System.out.println(name + "发现还剩下" + waterAmount + "升水。");
        return waterAmount;
    }

    void setPeopleNumber(int number){
        peopleNumber = number;
    }

    int getPeopleNumber(){
        return peopleNumber;
    }
}
