package Chapter10.Example8;

public class Demo {
    public static void main(String[] args) {
        Animal b0 = new Animal();
        Animal b1 = new Bear();
        Animal b2 = new Dog();
        Duck b3 = new Duck();
        Snake b4 = new Snake();

        makeSound(b0);
        makeSound(b1);
        makeSound(b2);
        makeSound(b3);
    }

    public static void makeSound(Animal b)
    {
        String sound = b.speak();
        System.out.println(sound);
    }

}

