package exeption11;

public class Userdefinedexception {
	public static void main (String[]args) throws InterruptedException {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		 Thread.sleep(2000);
		System.out.println(4);
		try {
		System.out.println(5/0);
		}
		catch(ArithmeticException ref) {
			
			System.out.println("its work"+ ref.getMessage());
		}
		finally {
		
		System.out.println("55555");
		
	}
		System.out.println(6);
}
}
