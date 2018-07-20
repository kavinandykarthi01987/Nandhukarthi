import java.util.*;
public class binarynumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String b=s.next();
		b=b.replaceAll("1", "");
		b=b.replaceAll("0", "");
		System.out.println(b);
		if(b.length()==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
