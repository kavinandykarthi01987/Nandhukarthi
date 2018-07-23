package playerguvi;
import java.util.*;
public class camelcase {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String in1=s.next();
      String in2=s.next();
      String out="";
      if(in1.length()<=10000000){
    	  String a=in1.substring(0,1).toUpperCase()+in1.substring(1).toLowerCase();
    	  String b=in2.substring(0,1).toUpperCase()+in2.substring(1).toLowerCase();
    	  System.out.println(a);  
    	  System.out.println(b);  
	}else{
		System.out.println("INVALID");
	}
  }
}
