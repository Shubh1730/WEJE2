package JavaPattern;

public class reverseno {

	public static void main(String[] args) {
		int a=15;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(a-- +"");
			}
			System.out.println();
		}
	}
}
