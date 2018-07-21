package leap;
import java.util.Scanner;
public class odddigit {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c[]=new int[6];
      int i=5;
      while(n!=0){
    	   c[i]=n%10;
    	  n=n/10;
    	  i--;
      }
      for(int j=0;j<6;j++){
    	  if(c[j]%2!=0){
    		  System.out.print(c[j] +" ");
    	  }
      }
	}
}
