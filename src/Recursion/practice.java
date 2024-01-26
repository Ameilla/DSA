package Recursion;

public class practice {
	static void print(int n)
	{
		if(n==5)
			return;
		System.out.print(n);
		print(n+1);
	}
	public static void main(String[] args)
	{
		print(1);
	}

}
