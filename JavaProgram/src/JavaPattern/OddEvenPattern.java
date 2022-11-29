package JavaPattern;

public class OddEvenPattern {
	public static void main(String[] args) {
		int  n=1;
		int a=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(n%2+" ");
				n++;
			}
				n=n-a;
				a++;
				System.out.println();
		}
	}

}
