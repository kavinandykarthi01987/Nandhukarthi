package stringnumber;
import java.util.Scanner;
public class vowelsornot {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String word=s.next();
        word=word.replaceAll("[^aeiou]", "");
        if(word.length()!=0){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }
	}
}
