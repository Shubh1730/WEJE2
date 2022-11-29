package hello;

public class min {
	public static void main(String[] args) {
		int [] b= {10,20,30,5,4,17};
		int min=b[0];
		for(int k=1; k<b.length; k++) {
			if(min > b[k])
			{
				min=b[k];
			}
		}
		System.out.println(min);
	}
}
