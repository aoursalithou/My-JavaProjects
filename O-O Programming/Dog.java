package ch16;

public class Dog implements ISpeakable{
    private String name;



    private double age;

    public Dog(){

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
    @Override
    public void speak() {
        System.out.println(name + "says hello");
    }
}
