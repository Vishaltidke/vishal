package inheritance;

public class Child1 extends Child {
	public static void derectaccess() {
	 	int g =5556;
	 	System.out.println("maja aya na bhidu" +g);
		
		
	}
	public static void main(String[]args) {
		Child1 obj  = new  Child1() ;
        Child1.derectaccess(); 
		obj.property1();
		obj. property4();
		obj.property5();
		property2();
		
	
		
}
}
