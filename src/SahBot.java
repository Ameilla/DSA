
import java.util.*;
public class SahBot {
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
    	Scanner input = new Scanner(System.in);
    	int n=5;
    	ArrayList<Integer> arr = new ArrayList<>();
    	for(int i=0;i<n;i++)
    	{
    		int x = input.nextInt();
    		arr.add(x);
    	}
    	System.out.print(arr);
    	for(int i=0;i<n;i++)
    	{
    		int x = input.nextInt();
    		arr.add(x);
    	}
    	System.out.print(arr);
    	
    	
    }
}



