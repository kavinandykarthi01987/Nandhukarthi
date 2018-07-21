package hunter;
import java.util.*;
public class uniqelementprint {
 public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int a[]=new int[n];
	 TreeSet uniq=new TreeSet();
	 for(int i=0;i<n;i++){
		 a[i]=s.nextInt();
	 }
	 for(int i=0;i<n;i++){
		 int count=0;
		 for(int j=0;j<n;j++){
			 if(a[i]==a[j]){
				 count++;
			 }
		 }
		 if(count==1){
			 uniq.add(a[i]);
		 }
	 }
	 for(Object k:uniq){
	 System.out.print(k +" ");
	 }
 }
}
