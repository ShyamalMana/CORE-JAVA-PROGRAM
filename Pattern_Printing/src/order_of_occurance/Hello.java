package order_of_occurance;

import java.util.HashMap;
import java.util.Map.Entry;


public class Hello 
{
	public static void main(String[] args) {
		String s="shayamal";
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++)
		{
					if(!h.containsKey(s.charAt(i)))
					{
						h.put(s.charAt(i), 1);
					}
					else
					{
						int count=h.get(s.charAt(i));
						count++;
						h.put(s.charAt(i), count);
					}
		}
		for(Entry e:h.entrySet())
		{
			System.out.println(e.getKey()+"- "+e.getValue());
		}
			
	}

}
