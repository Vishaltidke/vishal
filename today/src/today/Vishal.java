package today;

public class Vishal {
public static void  m1() { //static 
	int a =20;
	int b =40;
	int c= a-b;
	System.out.println(c);
	
	
}
public void ravi() {
	int n = 21;
	int v =3;
	int d = v+n;
	int g =n/v;
	int j=v%n;
	System.out.println(d);
	System.out.println(g);
	System.out.println(j);
}
public static void main(String[]args) {
	Vishal obj=new Vishal();
	obj.ravi();
m1();

}
}

