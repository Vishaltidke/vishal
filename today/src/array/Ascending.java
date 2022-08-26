package array;

public class Ascending {
	public static void main(String[]args) {
		int hold;
		int[]a= {10,9,8,7,6,5,4,3,2,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1 ;j < a.length;j++){
				if(a[i]>a[j]); {
				hold= a[i];
				a[i]=a[j];
				a[j]=hold;
				
			}
		}
	}
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");

}
}
