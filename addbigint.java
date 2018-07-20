package stringnumber;
import java.math.BigInteger;
import java.util.Scanner;
public class numericdig {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
        BigInteger  b=s.nextBigInteger();
        BigInteger  b1=new BigInteger("1");
        BigInteger  b2=b.add(b1);
        System.out.println(b2);
	}
}
