
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person("jiro,20");
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		Person saburo=new Person("saboro");
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
	}

}
