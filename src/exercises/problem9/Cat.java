package exercises.problem9;

public class Cat extends Animal{

    //名前セット
    public void setName(String name){
        this.name=name;
    }

    //年齢セット
    public void setAge(int age){
        this.age = age;
    }

    public void sleep(){
        System.out.println("スースー");
    }

    //泣き声追加
    @Override
    public void speak(){
        System.out.println("ニャー");
    }

}