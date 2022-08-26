package string;


	



	public class test1{
		public static void main(String[] args) {
			String st = "vishal";
			String res = "";
			for (int i = st.length()-1; i >= 0; i--)
				res = res + st.charAt(i);
			System.out.println(res);
		}
	}

	