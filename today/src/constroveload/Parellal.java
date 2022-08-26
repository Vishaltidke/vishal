package constroveload;

public class Parellal{
	 public  Parellal(int a) {
		  this(22,true);
		  System.out.println("its working");
	  }
	  public  Parellal(int a,boolean g){
		  
		  System.out.println("2 working");
	  }
	  public static void main(String []args) {
		  new Parellal();
		  
	  }
	  public  Parellal() {
		  this('j');
		  System.out.println("last method working");
}
}
