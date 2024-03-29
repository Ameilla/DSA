package practice;

public class One {
	
    public static void main(String[] args) {
        int n = 123;
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++)
        {
        	System.out.print(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            int t = (int) str.charAt(i);
            char ch = (char)(66 - t);
            System.out.print(ch);
        }
    }
}
