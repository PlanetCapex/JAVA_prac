package zad5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int convert_ages() {
        return 7 * age;
    }

    @Override
    public String toString() {
        return "Dog: " + "age = " + age + " name = " + name ;
    }
}
