package JavaStrig;

public class PallindromeString {
	public static void main(String[] args) {
		String m="mam";
		String rev="";
		for(int i=m.length()-1;i>=0;i--)
		{
			rev=rev+m.charAt(i);
			
		}
		if (m.equals(rev))
		{
		  System.out.println("pallindrome");	
		}
		else
		{
			System.out.println("not a pallindrome");
		}
	}

}
