package stringnumber;
import java.util.Scanner;
public class multipleof7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%7==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
