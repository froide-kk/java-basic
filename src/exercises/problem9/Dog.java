package exercises.problem9;

public class Dog extends Animal{
    public void run(){
        System.out.println("トコトコ");
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public void speak(){
        System.out.println("ワンワン");
    }
}
