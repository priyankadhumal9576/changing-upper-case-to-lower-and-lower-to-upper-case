import java.util.Scanner;
public class CharChice 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphaber");
		String ch=sc.next();
		char c=ch.charAt(0);
		String z="";
		
		if(c>='a' && c<='z')
		{	
			int n=c-32;
			c=(char)n;
			z=z+c;
			System.out.println("to upper case"+z);
			z="";
		}
		else if(c>='A' && c<='Z')
		{
		int n=c+32;
		c=(char)n;
		z=z+c;
		System.out.println("convert toLowerCase"+n);
				z="";
		
		}
		else
		{
			System.out.println("invalis input");
		}
		
		
		
		
		
		
		
		
		
	}

}