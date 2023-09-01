package Arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="java";
		String rev="";
		for (int i=S.length()-1;i>=0;i--)
		{
			rev=rev+S.charAt(i);
		}
         if(S.equals(rev))
         {
        	 System.out.println(S+" is a string palindrome");
         }
         else
         {
        	 System.out.println(S +" is not a string palindrome");

         }
	}

}
