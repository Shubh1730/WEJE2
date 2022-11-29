package JavaStrig;

public class StringSimple2 {
	public static void main(String[] args) {
		String s=new String("shubham");
		String a=new String("shubham");
		String z=new String("amul");
		System.out.println(s+a+z);//
		System.out.println(s==z);//false,becoz address refrecnce not same.
		System.out.println(s.equals(a));//true ,becoz of hashcode are same.
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		
	}

}
