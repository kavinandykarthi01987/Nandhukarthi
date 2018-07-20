package studentmark;
import java.util.*;
public class addition2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		if((N+M)%2==0){
			System.out.println("EVEN");
		}else{
			System.out.println("ODD");
		}
	}
}
