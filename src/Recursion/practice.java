package Recursion;

public class practice {
	static int print(int n)
	{
		if(n==1)
			return 1;
		return n*print(n-1);
		
	}
	static int sum_of_digit(int n)
	{
		if(n==0)
			return 0;
		return (n%10)+sum_of_digit(n/10);
	}
	static int product(int n)
	{
		if(n%10==n)
			return n;
		return (n%10)*product(n/10);
	}
	static int rev=0;
	static void reverse(int n)
	{
		if(n==0)
			return;
		int rem=n%10;
		rev=rev*10+rem;
		reverse(n/10);
		
	}
	public static void main(String[] args)
	{
		int n=1234;
		reverse(n);
		System.out.print(rev);
	}

}
