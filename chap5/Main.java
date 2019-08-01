public class Main{
	public static void main(String[] args){
		introduceOneself();
		System.out.println("----------------------------");
		email("test", "test@gmail.com", "test");
		System.out.println("----------------------------");
		email("test@gmail.com", "test");
		System.out.println("----------------------------");
		System.out.printf("底辺%fで高さが%fの三角形の面積は%fです　\n", 3.0,5.0,calcTriangleArea(3, 5));
		System.out.println("----------------------------");
		System.out.printf("半径が%fの円の面積は%fです　\n", 3.0,calcCircleArea(3));
	}
	public static void introduceOneself(){
		String name = "jiko";
		int age = 20;
		float height = 170;
		char sex = 'm';
		System.out.printf("私の名前は%sで、年齢は歳%d、身長%fは、性別は%cです\n", name, age, height, sex);
	}

	public static void email(String title, String address, String text){
		System.out.printf("%sに、以下のメールを送信しました\n", address);
		System.out.printf("件名：%s\n", title);
		System.out.printf("本文：%s\n", text);
	}

	public static void email(String address, String text){
		System.out.printf("%sに、以下のメールを送信しました\n", address);
		System.out.printf("件名：無題");
		System.out.printf("本文：%s\n", text);
	}

	public static double calcTriangleArea(double width, double height){
		double area = 0.5 * width * height;
		return area;
	}

	public static double calcCircleArea(double radius){
		double area = Math.PI * radius * radius;
		return area;
	}
}