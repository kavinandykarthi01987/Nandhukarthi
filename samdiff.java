package studentmark;
import java.util.Scanner;
public class sam {
  public static void main(String[] args){
	  Scanner s=new Scanner(System.in);
	  int n1=s.nextInt();
	  int n2=s.nextInt();
	  int cond=(int)Math.pow(2, 32);
	  if(n1<=cond && n2<=cond && n1<n2){
		  System.out.println(n2-n1);
	  }else{
		  System.out.println("INVALID");
	  }
  }
}
