package stringnumber;
import java.math.BigInteger;
import java.util.Scanner;
public class numericdig {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
        BigInteger  b=s.nextBigInteger();
        String s1=String.valueOf(b);
        System.out.println(s1.length());
	}
}
