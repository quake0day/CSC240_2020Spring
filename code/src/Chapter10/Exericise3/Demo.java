package Chapter10.Exericise3;

public class Demo {
    public static void main(String[] args) {
        Feeder f1 = new Feeder();
        Animal a1 = new Dog();
        Food food1 = new Bone();

        f1.feed(a1, food1); // feed dog with Bone

        a1 = new Cat();
        food1 = new Fish();
        f1.feed(a1, food1); // feed cat with Fish

        Animal a2 = new Fish();
        Food a3 = new Fish();
        f1.feed(a2, (Food) a2);
    }
}
