package exercises.problem8;

public class Dog {
    Dog( String breed ){
        this.breed = breed;
    }

    Dog(){

    }
    private String name;

    private int age;

    private String breed = "不明";

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( int age ){
        this.age = age;
    }

    public void showProfile() {
        System.out.println( "名前は、" + this.name + "です。" );
        System.out.println( "年齢は、" + this.age + "歳です。" );
        System.out.println( "犬種は、" + this.breed + "です。" );
    }
}
