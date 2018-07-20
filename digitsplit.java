package stringnumber;
import java.util.*;
public class digitsplit {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     String s1=String.valueOf(n);
     int l=s1.length();
     int a[]=new int[l];
     for(int i=l-1;i>=0;i--){
    	 a[i]=n%10;
    	 n=n/10;
     }
     for(int i=0;i<l;i++){
    	 System.out.print(a[i] +" ");
     }
	}
}
