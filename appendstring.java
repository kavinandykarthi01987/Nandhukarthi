package playerguvi;
import java.util.Scanner;
public class appendstring {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String s1=s.next();
       StringBuilder m=new StringBuilder(s1);
       m.append(".");
       System.out.println(m);
	}
}
