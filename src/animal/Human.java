package animal;

public class Human extends Animal implements Thinkable {
    //趣味の情報を保管するフィールドを定義
    private  String hobby;

    //コンストラクタ
    public Human() {
    }

    //引数ありコンストラクタ
    public Human(String name,int age,String hobby) {
    	super(name,age);
        //super.setName(name);
        //super.setAge(age);
        this.hobby=hobby;
    }

    public void think() {
        System.out.println("私は"+hobby+"について考えています。");
    }

}
