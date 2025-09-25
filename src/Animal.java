public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {

        this.name = name;
    }
    //funktioner
    public abstract void makeSound();

    public abstract void eat();

    public boolean isAdult(){
        if(age >= 5){
        return true;
        }
        return false;
    }



    //Getters och setters
    public String getName() {
        return name;
    }
    public int getAge() { return age;}
}