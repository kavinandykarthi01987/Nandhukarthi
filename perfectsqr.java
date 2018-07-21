package leap;
import java.util.Scanner;
public class perfectsqu {
	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         int n1=s.nextInt();
         int p=(int) Math.sqrt(n*n1);
         if((p*p) == (n*n1)){
        	 System.out.println("YES");
         }else{
        	 System.out.println("NO");
         }
         }
}
