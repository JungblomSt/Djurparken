import java.util.ArrayList;

public class ZooApp {

    ArrayList<Animal> animals = new ArrayList<>();

    public ZooApp() {
        initList();
        run();



    }
    private void run(){

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
        }

    }

    private void initList() {
        animals.add(new Dog("Ludde"));
        animals.add(new Dog("Molly"));
        animals.add(new Dolfin("Nemo"));
        animals.add(new Dolfin("Doris"));
        animals.add(new Krow("Kråkan"));
        animals.add(new Krow("Corvux"));
    }
}
