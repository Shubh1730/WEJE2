package JavaPattern;

public class Right2 {
	public static void main(String[] args) {
		int a=6;
		for(int i=1;i<=5;i++)
		{
			a=a-i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a++ +"");
			}
			System.out.println();
		}	
	}

}
