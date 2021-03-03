package exercises.problem8;

public class Dog {
    private String name;

    public void setName( String name ) {
        this.name = name;
    }

    public void showProfile() {
        System.out.println( "名前は、" + this.name + "です。" );
    }
}
