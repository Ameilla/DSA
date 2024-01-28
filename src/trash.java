
public class trash {
	public static void main(String[] args)
	{
		int n=5;
		System.out.print(n+" ");
		while(n>1)
		{
			if(n%2==0)
			{
				n=(int) Math.sqrt(n);
				System.out.print(n+" ");
			}
			else
			{
//				System.out.print(n);
				double t =Math.sqrt(n)*Math.sqrt(n)*Math.sqrt(n);
				n = (int)t;
				System.out.print(n+" ");
			}
		}
	}

}
