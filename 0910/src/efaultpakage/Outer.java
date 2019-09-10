package efaultpakage;

public class Outer {
	
	public static class Inner{
		public static void innerMethod() {
			System.out.printf("내부 클래스의 메소드\n");
		}
	}
public void outerMethod() {
	Inner inner = new Inner();
	inner.innerMethod();
}
}
