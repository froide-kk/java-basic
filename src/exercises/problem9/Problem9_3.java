package exercises.problem9;

public class Problem9_3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        c.setName("猫");
        c.setAge(2);
        d.setName("犬");
        d.setAge(4);
        c.showProfile();
        d.showProfile();
        a.speak();
        c.speak();
        d.speak();
    }
}
//実行結果
//名前は、猫、2歳です。
//名前は、犬、4歳です。
//......
//ニャー
//ワンワン