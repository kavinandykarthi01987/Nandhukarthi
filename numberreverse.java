package playerguvi;
import java.util.*;
public class numberreverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String s1=String.valueOf(n);
		String s2=new StringBuffer(s1).reverse().toString();
		System.out.println(s2);
	}
}
