package stringnumber;
import java.util.Scanner;
public class betwwentwonum {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int N=s.nextInt();
      int L=s.nextInt();
      int M=s.nextInt();
      int count=0;
      for(int i=L+1;i<M;i++){
    	  if(i==N){
    		  count++;
    	  }
      }
      if(count!=0){
    	  System.out.println("YES");
      }else{
    	  System.out.println("NO");
      }
	}
}
