package Arrays;

public class max_sum_subarray {
	public static void main(String[] args)
	{
		int a[]= {-2,-5,6,-1,-3};
		System.out.print(maxsubarray(a));
	}
	private static int maxsubarray(int[] a) {
		int max=a[0];
		int cmax=a[0];
		for(int i=1;i<a.length;i++)
		{
			cmax=Math.max(a[i],a[i]+cmax);
			max=Math.max(max, cmax);
		}
		return max;
	}
}
