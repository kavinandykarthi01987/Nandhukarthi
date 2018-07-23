package pro;
import java.text.DecimalFormat;
import java.util.*;
public class area {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     float l=s.nextFloat();
     float b=s.nextFloat();
     DecimalFormat dtime = new DecimalFormat("#.#####"); 
     System.out.println(dtime.format(l*b));
	}
}
