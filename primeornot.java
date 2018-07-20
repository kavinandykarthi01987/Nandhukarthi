import java.io.*;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		a=s.nextInt();		
		for(i=1;i<=a;i++)
		{
		if(a%i==0)
		{
			p++;
		}		
		}
		if(p==2)
		{
			System.out.print("prime");
		}
		else
		{
			System.out.print("not prime");
		}	} }
