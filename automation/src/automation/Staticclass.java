package automation;

public class Staticclass {
	
public static void test() {
	System.out.println("1");
	
}
public static class a{
	public static  void test1() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		Staticclass.test();
		a.test1();
	}
}
}
