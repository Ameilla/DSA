package Bit_Manipulation;

public class Bits {
	static int CountSetBits(int n)
	{
	
		int c=0;
		while(n!=0)
		{
			n=n&(n-1);
			c++;
		}
		return c;
	}
	static int FindRightMostSetBit(int n)
	{
//		return (int) (Math.log10(n ^ (n &(n-1)))/Math.log10(2))+1;
		
		int mask=1;
		if(n==-1)
			return -1;
		int pos=0;
		while((n & mask) ==0)
		{
			mask=mask<<1;
			pos++;
		}
		return pos;
	}
	public static void main(String[] args)
	{
		System.out.print(FindRightMostSetBit(7));
	}
		

}