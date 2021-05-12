package exercises.problem8;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public void setName( String name ) {
        this.name = name;
    }

    public void showProfile() {
        System.out.println( "犬種は、" + this.breed + "です。" );
        System.out.println( "名前は、" + this.name + "です。" );
        System.out.println( "年齢は、" + this.age + "です。" );
    }

    public void setAge(int age){
        this.age = age;
    }

    Dog(){
        this.breed = "ダックスフンド";
    }
}
