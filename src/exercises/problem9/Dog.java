package exercises.problem9;

public class Dog extends Animal{
    public void run(){
        System.out.println("トコトコ");
    }

    //名前セット
    public void setName(String name){
        this.name=name;
    }

    //年齢セット
    public void setAge(int age){
        this.age = age;
    }

    //泣き声追加
    @Override
    public void speak(){
        System.out.println("ワンワン");
    }
}
