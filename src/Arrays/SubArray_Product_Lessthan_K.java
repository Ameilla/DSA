package Arrays;

public class SubArray_Product_Lessthan_K {
	public static void main(String[] args)
	{
		int nums[] = new int[] {10,5,2,6};
		int k =100;
		System.out.print(printSubArrayCount(nums,k));
	}

	private static int  printSubArrayCount(int[] nums, int k) {
		int product = 1;
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			product = 1;
			for(int j=i;j<nums.length;j++)
			{
				product *= nums[j];
				if(product<k)
					count++;
			}
		}
		return count;
	}
}
