public class Krow extends Animal implements Flyable, Trainable{
    public Krow(String name, int age) {

        super(name, age);
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

    @Override
    public void performTrick() {
        System.out.println("Kråkan cyklar");
    }
}
