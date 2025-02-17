 interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

abstract class Duck {
    void swim() {
        System.out.println("All ducks can swim.");
    }
}

class RubberDuck extends Duck implements Quackable {
    public void quack() {
        System.out.println("Rubber Duck squeaks.");
    }
}
class WoodenDuck extends Duck implements Quackable {
    public void quack() {
        System.out.println("Rubber Duck is mute");
    }
}

 

class RedHeadDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}

class LakeDuck extends Duck implements Flyable, Quackable {
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }

    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}

public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();

        rd.swim();
        wd.swim();
        rhd.swim();
        ld.swim();

        ((Quackable) rd).quack();
        ((Quackable) wd).quack();
        ((Quackable) rhd).quack();
        ((Quackable) ld).quack();
        ((Flyable) rhd).fly();
        ((Flyable) ld).fly();
    }
}
