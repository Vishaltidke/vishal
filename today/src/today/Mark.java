package today;

public class Mark {
	int maths,physics,chemistry;
	public void avdhoot() {
		System.out.println("avdhoot:-maths=20,physics=40,chemistry=65");
	}
	public void raj() {
		System.out.println("raj:-maths=29,physics=50,chemistry=44");
	}
	public void roy() {
		System.out.println("roy:-maths=26,physics=30,chemistry=68");
		   
	}
public static void main(String[]args) {
	Mark obj = new Mark();
	obj.avdhoot();
	obj.raj();
	obj.roy();
}
}