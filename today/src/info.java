
public class info {
	public static void main(String[] args) {
		int[] ids; 
		int[] marks; 
		try {
			ids = new int[10];
			marks = new int[-10];	// line 1
			ids[10] = 111;
			marks[10] = 100;
		}
		catch(ArrayIndexOutOfBoundsException  | NegativeArraySizeException exc2) {	// line 2
			// Statements that handle the exception
		}
	}
}