package exercises.problem8;

public class Dog {
    private String name;
    private int age;
    private String breed;

    Dog(String breed){
        this.breed  = breed;
    }
    Dog(){
        this.breed = "不明";
    }

    public void setName( String name ) {
        this.name = name;
    }
    public void setAge( int age ) { this.age = age; }

    public void showProfile() {
        System.out.println( "名前は" + this.name + "," + "年齢は" + this.age + "歳," + "犬種は" + this.breed + "です。" );


    }
}
