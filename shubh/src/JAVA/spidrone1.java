package JAVA;

public class spidrone1 {
public static void main(String[] args) {
	
	String s= "ssddrrrrdtd";
	 
	 int count2=0;
	 char c=0;
	 for(int i=0;i<s.length();i++) {
		 int count1=0;
		 for(int j=i+1;j<s.length();j++) {
			 if(s.charAt(i)==s.charAt(j)) {
				 count1++;
			 }
		 }
		 if(count1>count2) {
			 count2=count1;
			 c=s.charAt(i);
		 }
	 }
	 System.out.println( "heishest occerece of "+c+"="+count2);
	 
}

}
