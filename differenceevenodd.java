package stringnumber;
import java.util.*;
public class differenceevenodd {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int num1=s.nextInt();
	int num3=num-num1;
	if(num3%2==0){
		System.out.println("EVEN");
	}else{
		System.out.println("ODD");
	}
	}
}
