package leap;
import java.util.Scanner;
public class factorsofnum {
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
         int n=s.nextInt(),p=0;
         for(int i=1;i<=n;i++){
        	 if(n%i==0){
        		 System.out.print(i +" ");
        	 }
         }
	}
}
