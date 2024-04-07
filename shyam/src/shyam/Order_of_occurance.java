package shyam;


import java.util.HashMap;
import java.util.Map.Entry;

public class Order_of_occurance 
{
	public static void main(String[] args) {
		String [] arr= {"java","sql","java"};
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!h.containsKey(arr[i]))
			{
				h.put(arr[i], 1);
			}
			else
			{
				int temp=h.get(arr[i]);
				temp++;
				h.put(arr[i], temp);
				
			}
		}
		for(Entry<String, Integer> e: h.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
