abstract class GirlFriend {
    abstract void speak();

    abstract void cooking();
}

class Girl extends GirlFriend{
    @Override
    void speak() {
        System.out.println("Hello, have a good day!");
    }

    @Override
    void cooking() {
        System.out.println("I will going tu cooking soon!");
    }
}
