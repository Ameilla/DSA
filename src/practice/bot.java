package practice;

import java.util.*;
public class bot {
	public static void main(String[] args)
	{
		String str = new String("13579");
		char c[] = str.toCharArray();
		boolean t = true;
		while(t)
		{
			t = false;
			for(int i=0;i<c.length-1;i++)
			{
				if(((c[i]-'0')%2)==((c[i+1]-'0')%2))
				{
					if(c[i]<c[i+1])
					{
						char temp = c[i];
						c[i] = c[i+1];
						c[i+1] = temp;
						t = true;
					}
				}
			}
		}
		System.out.print(Arrays.toString(c));
	}
}