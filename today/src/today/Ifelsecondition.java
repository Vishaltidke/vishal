package today;

public class Ifelsecondition {//class create
	int maths;
	int chem;
    int phy;
    public void m1(int maths,int phy,int chem,String studentname) {//non static method
    	System.out.println("\n");
    	
    	
    	System.out.println("name of student:-" + studentname);
    	System.out.println("maths:-" + maths);
    	System.out.println("phy:-" +phy);
    	System.out.println("chem:-"+chem);
    	int total = maths+phy+chem;
    	System.out.println("total:"+total);
    	
    	if(maths>35&&phy>35&&chem>35)              //if condition
    	
    	
        System.out.println("result is pass");
    	
    	 
    	else                                       // e
        System.out.println("result is fail");
    }
    public static void main(String[]args) {             //main method
    	Ifelsecondition obj= new Ifelsecondition();
    	obj.m1(04, 02, 01, "raju");
    	obj.m1(30,66,90, "moni");
    	obj.m1(30,66,90, "roy");
    }

}
