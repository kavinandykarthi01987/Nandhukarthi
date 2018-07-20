package stringnumber;
import java.util.*;
public class arrayrepeatation {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int N=s.nextInt();
     int k=s.nextInt();
     int count=0;
     int a[]=new int[N];
     for(int i=0;i<N;i++){
    	 a[i]=s.nextInt();
    	 if(a[i]==k){
    		 count++;
    	 }
     }
     System.out.println(count);
	}
}
