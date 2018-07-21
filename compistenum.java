package leap;
import java.util.Scanner;
public class compositenum {
	public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
         int n=s.nextInt(),p=0;
         for(int i=1;i<=n;i++){
        	 if(n%i==0){
        		 p++;
        	 }
         }
         if(p==2){
        	 System.out.println("NO");
         }else{
        	 System.out.println("YES");
         }
	}
}
