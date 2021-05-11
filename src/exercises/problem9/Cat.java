package exercises.problem9;

public class Cat extends Animal{

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void sleep(){
        System.out.println("スースー");
    }

    @Override
    public void speak(){
        System.out.println("ニャー");
    }

}