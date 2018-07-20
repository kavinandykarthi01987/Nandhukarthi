package stringnumber;
import java.util.*;
public class sumofdigit {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int num=s.nextInt();
     int sum=0;
     while(num!=0){
    	 int c=num%10;
    	 num=num/10;
    	 sum=sum+c;
     }
     System.out.println(sum);
	}
}
