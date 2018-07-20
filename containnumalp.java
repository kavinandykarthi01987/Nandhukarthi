package stringnumber;
import java.util.*;
public class containnumalp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String num=s1.replaceAll("[^0-9]","");
		String alp=s1.replaceAll("[^A-Za-z]","");
		if(num.length()!=0 && alp.length()!=0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
