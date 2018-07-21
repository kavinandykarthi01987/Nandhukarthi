package stringnumber;
import java.util.Scanner;
public class rounddigit {
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
          float f=s.nextFloat();
          System.out.println((int)Math.ceil(f));
	}
}
