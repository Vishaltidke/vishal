package array;

public class Descending {
	public static void main(String[]args) {
		int hold;
		int[]a= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1 ;j < a.length;j++){
				if(a[i]<a[j]); {
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
