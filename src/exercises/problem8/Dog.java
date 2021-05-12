package exercises.problem8;

public class Dog {
    private String name;
    private Integer age;
    private String Breed;

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( Integer age ) { this.age = age;}

    Dog(String newBreed){
        this.Breed = newBreed;
    }

    public void showProfile() {
        System.out.println( "名前は、" + this.name + "です。" );
        System.out.println( "年齢は、" + this.age + "歳です。");
        System.out.println( "犬種は、" + this.Breed + "です。");
    }
}
