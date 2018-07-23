package playerguvi;
import java.util.*;
public class swapevenodd {
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String in=s.next();
      String out="";
      if(in.length()<=10000000){
      for(int i=0;i<in.length();i=i+2){
    	  if(i+1!=in.length()){
    	  char a=(char)in.charAt(i+1);
    	 char b=(char)in.charAt(i);
    	 System.out.print(a+""+b);
      }else{
    	  System.out.print(in.charAt(i));
      }
      }
	}else{
		System.out.println("INVALID");
	}
  }
}
