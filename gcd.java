package pro;
import java.util.*;
public class gcdoftwonumbers {
  public static void main(String[] args){
	  Scanner s=new Scanner(System.in);
	  int N=s.nextInt();
	  int Q=s.nextInt();
	  int a[]=new int[N];
	  for(int i=0;i<N;i++){
		  a[i]=s.nextInt();
	  }
	  int L=0,R=0,count=0;
	  for(int i=0;i<Q;i++){
		  L=s.nextInt();
		  R=s.nextInt();
		  count=0;
		  for(int j=0;j<N;j++){
				  if(L==a[j] || R==a[j]){
					  if(L==R){
						  count=2;
					  }else{
				  count++;
					  }
				  }
		  }
		  if(count==2){
			  System.out.println(gcd(L,R));			  
		  }else{
			  System.out.println("INVALID");
		  }
		  }	  
  }
private static int gcd(int a, int b) {
	      if (a == 0 || b == 0){
	         return 0;
	      }
	      if (a == b){
	    	  return a;
	      }
	      if (a > b){
	    	  return (gcd(a-b, b));
	      }else{
		return gcd(a, b-a);
	      }
}
}

