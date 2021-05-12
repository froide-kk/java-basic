package exercises.problem8;

public class Dog {
    private String name;
    //    年齢を保持する int 型のメンバー変数 age
    private int age;
    //    犬種を保持するString型のメンバー変数 breed
    private String breed;
    //    犬種を設定する引数（ String ）を持つコンストラクタ
    Dog(String b) {
        this.breed = b;
    }
    public void setName( String name ) {
        this.name = name;
    }
    //    年齢を設定するメンバーメソッド setAge
    public void setAge( int age ) { this.age = age; }

    public void showProfile() {
        //    showProfile メソッドで名前、年齢を表示するようにする。
        System.out.println( "名前は、" + this.name + "です。" );
        System.out.println( "年齢は、" + this.age + "歳です。" );
        System.out.println( "犬種:" + this.breed );
    }
}
