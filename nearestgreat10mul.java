package studentmark;
import java.util.*;
public class nearestgreat10mul {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=0,N=s.nextInt();
		int t=N;
		int m=N;
		if(N<=10000){
		while(N!=0){
		    N=N/10;
		    n++;
		}
		int i=n-1;
		int c[]=new int[n];
		while(t!=0){
			c[i]=t%10;
			t=t/10;
			i--;
		}
		int v=0,a[]={1,2,3,4,5,6,7,8,9,10};
	     switch(n){
	     case 1:
	 		System.out.println(10);
			break;
	     case 2:
	    	 if(c[1]==0){
	    		System.out.println(m); 
	    	 }else{
	    		  v=c[0];
		System.out.println(a[v]*10);
	    	 }
		break;
	     case 3:
	    	 if(c[1]==0 || c[2]==0){
		    		System.out.println(m); 
		    	 }else{
		    		  v=c[1];
			System.out.println((c[0]*100)+(a[v]*10));
		    	 }
			break;
	     case 4: 
	    	 if(c[1]==0 || c[2]==0 || c[3]==0){
	    		System.out.println(m); 
	    	 }else{
	    		  v=c[2];
		System.out.println((c[0]*1000)+(c[1]*100)+(a[v]*10));
	    	 }
			break;
	     case 5:
			System.out.println(10000);
			break;
	}
		}else{
			System.out.println("INVALID");
		}
	}
}
