package spidrone;
import java.util.Scanner;
public class Maxocc 
{
public static void main(String[] args)
   {
	String maxOcc;
	char maxChar=' ';
	int i,max=-1;
	int[] charfreq=new int[256];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String to find max char occerence= ");
	maxOcc=sc.nextLine();
	
	for(i=0 ;i< maxOcc.length();i++)
	{
		charfreq[maxOcc.charAt(i)]++;
		
	}
	for(i=0; i<maxOcc.length(); i++)	
	{
		char ch = maxOcc.charAt(i);
		if (max < charfreq[ch]) {
			max = charfreq[ch];
			maxChar =ch;
			
		}
	}
	System.out.println("the max of occer character= "+maxChar);
	System.out.format("%c,character occer %d times",maxChar,max);
   }
}
