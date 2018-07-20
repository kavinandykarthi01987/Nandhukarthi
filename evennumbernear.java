package stringnumber;
import java.util.*;
public class evennumbernear {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num%2==0){
		System.out.println(num);
	}else{
		System.out.println(num-1);
	}
	}
}
