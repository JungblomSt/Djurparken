import java.util.ArrayList;

public class ZooApp {

    ArrayList<Animal> animals = new ArrayList<>();

    public ZooApp() {
        initList();
        run();

    }
    private void run(){

        for (Animal a : animals) {
            a.eat();
            a.makeSound();
            move(a);
            printPerformTrickIfAdult(a);
            printIsAdult(a);
            System.out.println();
        }

    }

    private static void move(Animal animal) {
        if (animal instanceof Dolfin d){
            d.swim();
        }
        else if  (animal instanceof Krow k){
            k.fly();
        }
    }

    private static void printPerformTrickIfAdult(Animal animal) {
        if (animal.isAdult()){
            if (animal instanceof Trainable){
                ((Trainable) animal).performTrick();
            }
        }
        else
            System.out.println(animal.getName() + " har inte lärt sig trick, ännu");
    }

    private void printIsAdult(Animal animal) {
        if (animal.isAdult()){
            System.out.println(animal.getName() + " är vuxen");
        }
        else
            System.out.println(animal.getName() + " är en bäbis");
    }

    private void initList() {
        animals.add(new Dog("Ludde", 1));
        animals.add(new Dog("Molly", 5));
        animals.add(new Dolfin("Nemo", 3));
        animals.add(new Dolfin("Doris", 8));
        animals.add(new Krow("Krax", 2));
        animals.add(new Krow("Corvux", 10));
        animals.add(new Eagle("Göran", 7));
    }
}
