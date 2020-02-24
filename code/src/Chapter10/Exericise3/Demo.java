package Chapter10.Exericise3;

public class Demo {
    public static void main(String[] args) {
        Feeder f1 = new Feeder();
        Animal a1 = new Dog();
        Food food1 = new Bone();
        f1.feed(a1, food1); // feed bone to dog

        a1 = new Cat();
        food1 = new Fish();
        f1.feed(a1, food1); // feed fish to cat
    }
}
