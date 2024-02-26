
import java.util.*;
public class SahBot {
	public static int find(int a[])
	{
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				pos.add(a[i]);
			else
				neg.add(a[i]);
		}
		Collections.sort(pos);
		Collections.sort(neg);
		return pos.get(pos.size()-2)+neg.get(1);
		
	}
    public static void main(String[] args) {
//        String[] a = {"Apple", "Amar", "Banana"};
//        for (int i = 0; i < a.length; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[i].compareTo(a[j]) > 0) {
//                    String temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for (String s : a) {
//            System.out.println(s);
//        }
    	int a[] = {3,2,1,7,5,4};
    	System.out.print(find(a));
    	
    }
}



