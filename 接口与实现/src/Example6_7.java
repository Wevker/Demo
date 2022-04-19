public class Example6_7 {
    public static void main(String[] args) {

    }
}

interface Advertisement {
    void showAdvertisement();
    String getCorpName();
}

class WhiteCorp implements Advertisement {
    String name = "白云公司";
    String adv = "飞机中的战斗机,哎 yes!";

    @Override
    public void showAdvertisement() {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(this.adv);
        System.out.println("@@@@@@@@@@@@@");
    }

    @Override
    public String getCorpName() {
        return this.name;
    }
}

class BlackLandCorp implements Advertisement {
    String name = "黑土集团";
    String adv = "劳动是爹\n土地是妈";

    @Override
    public void showAdvertisement() {
        System.out.println("*************");
        System.out.println(this.adv);
        System.out.println("*************");
    }

    @Override
    public String getCorpName() {
        return this.name;
    }
}

class AdvertisementBoard {
    Advertisement adver;

    void setAdvertisement(Advertisement advertisement) {
        System.out.println(advertisement.getCorpName());
        advertisement.showAdvertisement();
    }
}