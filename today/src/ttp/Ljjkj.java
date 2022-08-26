package ttp;

public class Ljjkj {
	public static void main(String[] args) {
		int a[]= {10,10,10,10,10,10,10,10
				};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
		sum=sum+a[i];
		}
		System.out.println("The sum of array is "+sum);
		//Enhanced For loop LOGIC 2
		for(int value:a)
		{
		sum=sum+value;
		}
		System.out.println("The sum of array is "+sum);
		}
	

}