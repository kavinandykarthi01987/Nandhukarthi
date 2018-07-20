package stringnumber;
import java.util.*;
public class avegage {
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int a[]=new int[n];
	   for(int i=0;i<n;i++){
		   a[i]=s.nextInt();
	   }
	   n=n/2;
	   System.out.println(a[n]);
	}
}
