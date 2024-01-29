import java.io.*;
import java.util.*; 
public class trash {

    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int n=str.length();
        int i;
        StringBuilder a=new StringBuilder(str);
        a.setLength(1);
        int q=n/16;
        int r=n%16;
        if(r<10)
        {
        	a.append(String.valueOf(r));
        }
        else if(r==10)
        {
        	a.append("a");
        }
        else if(r==11)
        {
        	a.append("b");
        }
        else if(r==12)
        {
        	a.append("c");
        }
        else if(r==13)
        {
        	a.append("d");
        }
        else if(r==14)
        {
        	a.append("e");
        }
        else if(r==15)
        {
        	a.append("5");
        }
        System.out.print(a.reverse().toString());
        
        
    }
}
