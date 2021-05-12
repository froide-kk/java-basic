package exercises.problem9;

public class Animal {
    public String name;
    public int age;

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( int age ){
        this.age = age;
    }

    public void showProfile() {
        System.out.println( "名前は、" + name + "、" + age + "歳です。" );
    }

    public void speak() {
        System.out.println( "......" );
    }
}
