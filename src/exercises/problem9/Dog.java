package exercises.problem9;

public class Dog extends Animal{

    public void run() {System.out.println("トコトコ");}

    @Override
    public void speak() {
        System.out.println( "ワンワン" );
    }
}
