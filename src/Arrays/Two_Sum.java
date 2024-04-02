package Arrays;
import java.util.*;

public class Two_Sum {
	private static int[] twosum(int[] nums, int target)
	{
		Map<Integer,Integer> map = new HashMap<>();
		int diff = 0;
		for(int i=0;i<nums.length;i++)
		{
			diff = target - nums[i];
			if(map.containsKey(diff)) {
				return new int[] {map.get(diff),i};
			}
			map.put(nums[i],i);
		}
		
		return null;
	}
	public static void main(String[] args)
	{
		int nums[] = new int[] {2,7,4,5};
		int target = 9;
		int a[] = twosum(nums,target);
		if(a!=null)
			System.out.print(a[0]+"  "+a[1]);
		
	}

}
	