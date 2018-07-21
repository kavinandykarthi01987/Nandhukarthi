package hunter;
import java.util.*;
public class largestnumber {
	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++){
	 a[i]=s.nextInt();
 }
 Arrays.sort(a);
 int out=0;
 for(int i=n-1;i>=0;i--){
	 out=(out*10)+a[i];
 }
 System.out.println(out);
	}
}
