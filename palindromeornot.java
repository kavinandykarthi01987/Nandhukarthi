package stringnumber;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=new StringBuffer(s1).reverse().toString();
		if(s1.equals(s2)){
			System.out.println("YES");
		}else{
	       System.out.println("NO");		
		}		
	}
}
