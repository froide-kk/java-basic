package exercises.problem9;

public class Cat extends Animal{

    public void sleep() {System.out.println("スースー");}

    @Override
    public void speak() {
        System.out.println( "ニャー" );
    }
}
