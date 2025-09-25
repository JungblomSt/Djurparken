public class Krow extends Animal implements Flyable{
    public Krow(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " låter rrrraaaa rrrraaaaa!");

    }
    @Override
    public void eat(){
        System.out.println("Kråkan " + getName() + " äter allt hen kan hitta");

    }

    @Override
    public void fly() {
        System.out.println(getName() + " flyger");
    }
}
