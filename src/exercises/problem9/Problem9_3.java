package exercises.problem9;

public class Problem9_3 {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setName("みけ");
        cat.setAge(10);
        cat.showProfile();
        cat.sleep();
        cat.speak();

        Dog dog = new Dog();
        dog.setName("まる");
        dog.setAge(10);
        dog.showProfile();
        dog.run();
        dog.speak();
    }
}
