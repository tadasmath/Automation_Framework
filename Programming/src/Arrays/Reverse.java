package Arrays;

public class Reverse {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String S="java";
		String rev="";
		for (int i=S.length()-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
		}
		System.out.println(rev);
	}

}
