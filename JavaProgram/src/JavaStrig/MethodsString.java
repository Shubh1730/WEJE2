package JavaStrig;

public class MethodsString {
	public static void main(String[] args) {
		String s="SHUBHAM";
		String o="gore";
//		covert upper to lower
		System.out.println(s.toLowerCase());
//		convrt lower to upper
		System.out.println(o.toUpperCase());
//		concate the string or adding  
		System.out.println(s.concat(o)+" "+o.concat(s));
//		find the lenght of String
		System.out.println(o.length());
		
		
		String z="   SG   ";
//		totrim the String where the white space
		System.out.println(z.trim());
		String p="";
//		to find the string is empty or not
		System.out.println(p.isEmpty());
//		replce the char in String
		System.out.println(o.replace('o', 'm'));
	
	}

}
