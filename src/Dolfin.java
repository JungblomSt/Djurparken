public class Dolfin extends Animal implements Swimmable, Trainable{

    public Dolfin(String name,  int age) {

        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " låter hihihihi");

    }

    @Override
    public void eat() {
        System.out.println("Delfinen " + getName() + " äter fisk");

    }

    @Override
    public void swim() {
        System.out.println(getName() + " simmar i vattnet");
    }

    @Override
    public void performTrick() {
        System.out.println("Delfinen slår i en boll i ett basketmål");
    }
}
