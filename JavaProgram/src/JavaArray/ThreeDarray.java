package JavaArray;
public class ThreeDarray {
	public static void main(String[] args) {
		int[][] a={{41,42,22},{11,12,13},{22,23,24}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		
		   
	}

}
