package guvi;
import java.util.*;
public class special {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 String input=s.nextLine();
	 input=input.replaceAll("[^!@#$%^&*()]", "");
	 int count=input.length();
   System.out.println(count);
	}
}
