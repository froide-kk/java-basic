package exercises.problem9;

public class Animal {
    public String name;
    public int age;

    public void setProfile( String name, int age ) {
        this.age = age;
        this.name = name;
    }

    public void showProfile() {
        System.out.println( "名前は、" + name + "、" + age + "歳です。" );
    }

    public void speak() {
        System.out.println( "......" );
    }
}
