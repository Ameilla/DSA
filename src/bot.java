import java.util.Arrays;

public class bot {

	public static void main(String[] args) {
		int[] a = {1,2,1,2,2,2,3,3,3,4,5};
		int[] freq = new int[a.length];
		for(int i=0;i<a.length;i++)
		{
//			int visited =1;
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=-1;
				}
			}
			if(freq[i]!=-1)
				freq[i]=count;
		}
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]!=-1)
			{
//			System.out.println(a[i]+" = "+freq[i]);
			}
		}
		
		int max = Arrays.stream(a).max().orElse(0);
//		System.out.print(max);
		int[] t= new int[max+1];
		for(int i:a)
		{
			t[i]++;
		}
		for(int i=0;i<t.length;i++)
		{
			if(t[i]!=0)
			{
				System.out.println(i+" = "+t[i]);
			}
		}
		
		

	}

}