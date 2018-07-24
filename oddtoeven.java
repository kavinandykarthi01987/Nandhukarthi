package playerguvi;
import java.util.*;
public class oddtoeven {
	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   String w=s.next();
   String odd="",even="";
   char ch[]=w.toCharArray();
   for(int i=0;i<ch.length;i++){
	   if(i%2==0){
		   odd=odd+String.valueOf(ch[i]);
	   }else{
		   even=even+String.valueOf(ch[i]);
	   }
   }
   System.out.println(odd +" " +even);
   System.out.println();
	}

}
