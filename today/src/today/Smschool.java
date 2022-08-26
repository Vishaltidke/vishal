package today;


public class Smschool {
  public int gen(int maths, int phy,int chem , String studentname) {
	  System.out.println("name of student :- "+ studentname);
	  System.out.println("marks of student :- "+ maths);
	  System.out.println("marks of student :- "+ phy);
	  System.out.println("marks of student :- "+ chem);
	  return maths+phy+chem;
	  
  }
  public static void main(String[]args) {
	  
	  Smschool obj =new Smschool();
	  System.out.println(obj.gen(80, 80, 90, "vijay patil"));
	  System.out.println();
	  System.out.println(obj.gen(40, 20, 30, "jay mehta"));
	  System.out.println();
	  System.out.println(obj.gen(10, 60, 70, "moni roy"));
	  
	  
	  
	  
	  }
}
