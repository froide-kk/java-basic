package exercises.problem8;

public class Dog {
    private String name;
    private int age;
    private String breed;

    Dog(String newBreed) {
        this.name = "";
        this.age = 0;
        this.breed = newBreed;
    }

    public void setAge ( Integer age){
        this.age = age;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void showProfile() {
        System.out.println( "名前は、" + this.name + "です。" );
        System.out.println( "年齢は、" + this.age + "です。" );
        System.out.println( "犬種は、" + this.breed + "です。" );
    }
}
