package efaultpakage;

public class Main {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
		
		//Inner 클래스의 객체를 직접 생성할 수 없
	
	//Inner inner = new Inner();
		
		
	
		Outer.Inner i = new Outer(). new Inner();
		i.innerMethod();
		
		
		// TODO Auto-generated method stub

	}

}
