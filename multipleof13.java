package leap;
import java.util.Scanner;
public class multipleof13 {
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        	 if(n%13==0){
        		 System.out.println("YES");
         }else{
        	 System.out.println("NO");
         }
	}
}
