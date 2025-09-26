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

        move();
//        printIsAdult();
        
    }

    private void printIsAdult() {
        for (Animal animal : animals) {
            if (animal.isAdult()){
                System.out.println(animal.getName() + " är vuxen");
            }
            else
                System.out.println(animal.getName() + "är en bäbis");
        }
    }

    private void move() {
        for (Animal animal : animals) {
            if (animal instanceof Dolfin d){
                d.swim();
            }
            else if  (animal instanceof Krow k){
                k.fly();
            }

        }
    }

    private void initList() {
        animals.add(new Dog("Ludde", 1));
        animals.add(new Dog("Molly", 5));
        animals.add(new Dolfin("Nemo", 3));
        animals.add(new Dolfin("Doris", 8));
        animals.add(new Krow("Kråkan", 2));
        animals.add(new Krow("Corvux", 10));
    }
}
