package stringnumber;
import java.util.Scanner;
public class range10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num>=1 && num<=10){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
