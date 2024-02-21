import java.util.*;
public class t1 {
	public static void main(String[] args)
	{
		int t=5;
        for(int i=5+1;i<=2147483647;i++)
        {
            t=t&i;
        }
       System.out.print(t);	
	}

}
