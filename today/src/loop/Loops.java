package loop;

public class Loops {
	 public  int power(int n,int p) throws Exception 
	 {
	  //TODO Auto-generated method stub
	  if(n<0 || p<0)
	  {
	   throw new Exception("n or p should not be Negative.");
	  }
	  else if (n==0 && p==0)
	  {
	   throw new Exception("n ad p should not be zero");
	  }
	  else
	  {
	   return((int)Math.pow(n, p));
	  }
	 }
}