package exercises.problem9;

public class Problem9_3 {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("さくら");
        cat.setAge(12);

        dog.setName("ハチ");
        dog.setAge(6);

        cat.showProfile();
        dog.showProfile();

        cat.speak();
        dog.speak();
    }
}
