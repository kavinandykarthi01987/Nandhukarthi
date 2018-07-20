package guvi;
import java.util.*;
public class counting {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 String input=s.nextLine();
	 int count=0;
	 String str[]=input.split(" ");
	 for(int i=0;i<str.length;i++){
		 count=count+str[i].length();
	 }
   System.out.println(count);
	}
}
