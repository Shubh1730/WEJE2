package spidrone;

import java.util.TreeMap;

public class Distinctchar
{
public static void main(String[] args){
	String s="abcabdabab";
	char []arr=s.toCharArray();
	int count=0;
	TreeMap <character,integer> Map= new TreeMap<>();
	for(int i=0;i<arr.length ;i++)
	{
		count=0;
		for(int j=0;j<arr.length; j++)
		{
			if(arr[i]==arr[j])
			{
			  count ++;
			}
		}
		Map.put(arr[i],count);
	}
	System.out.println(Map);
}
}