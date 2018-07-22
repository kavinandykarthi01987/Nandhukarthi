package playerguvi;
import java.util.*;
public class stringreverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=new StringBuffer(s1).reverse().toString();
		System.out.println(s2);
	}
}
