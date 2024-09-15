package animal;

public class Animal {
	//名前を格納するフィールドと、年齢を格納するフィールドの定義
	private String name;//名前
	private int age;//年齢
	
	//コンストラクタ
	public Animal() {
	}
	//引数ありコンストラクタ
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//名前
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	//年齢
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//sayのメソッド
	public void say() {
		System.out.println(name+"です。"+age+"歳です。");
	}
}
