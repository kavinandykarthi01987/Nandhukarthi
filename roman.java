package playerguvi;
import java.util.*;
public class romannumber {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String r=s.next();
        r=r.toUpperCase();
        String str[]=r.split("");
        HashMap rom=new HashMap();
        rom.put("V",5);
        rom.put("I",1);
        rom.put("X",10);
        if(str.length>1){
        	int c=(int)rom.get(str[0]);
            int c1=(int)rom.get(str[1]);
            if(c<c1){
            	System.out.println(c1-c);
            }else{
            	System.out.println(c1+c);
            }
        }else{
        	System.out.println(rom.get(str[0]));
        }
	}

}
