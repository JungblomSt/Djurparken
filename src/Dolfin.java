public class Dolfin extends Animal implements Swimmable{

    public Dolfin(String name) {
        super(name);
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
}
