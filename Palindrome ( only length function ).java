import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int flag=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length()/2;i++)
		{
		    if(s.charAt(i)==s.charAt(s.length()-i-1))
		        flag=0;
		    else
		    {
		        flag=1;
		        break;
		    }
		}
		String pal=(flag==1)?"Not palindrome":"Is palindrome";
		System.out.println(pal);
		
	}
}
