package guvi;
import java.util.*;
public class number{
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 String input=s.nextLine();
	 input=input.replaceAll("[^0-9]", "");
	 int count=input.length();
   System.out.println(count);
	}
}
