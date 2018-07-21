package stringnumber;
import java.util.Scanner;
public class middlechange {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       String word=s.next();
       int l1,l=word.length();
       if(l%2!=0){
    	   l1=l/2;
    	   System.out.println(word.substring(0, l1)+"*"+word.substring(l1+1));
       }else{
    	   l1=l/2;
    	   System.out.println(word.substring(0, l1-1)+"**"+word.substring(l1+1)); 
       }
	}
}
