package Prototype;

public class Rabbit implements Cloneable{
    public enum Breed{
        HIMALAYAN,
        AMERICAN,
        DUTCH
    }

    private int age;
    private Breed breed;
    private Person owner;

    public Rabbit(){
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        this.owner = new Person(name);
    }

    @Override
    public Rabbit clone() {
        try{
            Rabbit rabbitClone = (Rabbit) super.clone();
            rabbitClone.owner = owner.clone();
            return rabbitClone;
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError(e.getMessage());
        }

    }
}
