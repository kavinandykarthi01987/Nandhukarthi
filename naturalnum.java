package stringnumber;
import java.util.*;
public class naturalnumber {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int N=s.nextInt();
       int sum=0,i=1;
       while(i<=N){
    	   sum=sum+i;
    	   i++;
       }
       System.out.println(sum);
	}
}
