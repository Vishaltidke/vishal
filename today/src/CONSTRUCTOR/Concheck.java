package CONSTRUCTOR;

public class Concheck {
   public Concheck(int a, boolean b) {
	   
	   System.out.println("number 1 is running");
   }
   public Concheck() {
	   this(66);
	   System.out.println("number 2 is running");
   }
   public Concheck(int a) {
	   this(84,true);
	   System.out.println("number 3 is running");
	   
   }
  public static void main(String[]args) {
     new Concheck();
}
}
