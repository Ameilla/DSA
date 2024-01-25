package Arrays;
import java.util.*;

public class Rotate_Image {
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int n=a.length;
		for(int i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				int t=a[i][j];
				a[i][j]=a[i][n-j-1];
				a[i][n-j-1]=t;
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(Arrays.toString(a[i]));
	}

}
