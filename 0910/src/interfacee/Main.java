package interfacee;

public class Main {
	
	String str;

	public static void main(String[] args) {
		
		
		
		Service service = new Serviceimpl();
		service.insert();
		service.read();
		service.update();
		service.remove();

	}

}
