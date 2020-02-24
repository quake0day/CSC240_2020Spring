package Chapter10.Exercise2;

public class Feeder {
    public void feed(Animal a, Food b)
    {
        System.out.printf("feed %s with %s \n", a.name, b.foodname);
        System.out.println("feed " + a.name + " with " + b.foodname);
    }
}
