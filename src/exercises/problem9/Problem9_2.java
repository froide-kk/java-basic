package exercises.problem9;

public class Problem9_2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "hoge";
        cat.age = 19;
        cat.showProfile();
        cat.sleep();
        Dog dog = new Dog();
        dog.name = "hoge丸";
        dog.age = 89;
        dog.showProfile();
        dog.run();
    }
}
