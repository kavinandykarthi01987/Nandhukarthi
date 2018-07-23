import java.util.Arrays;
import java.util.Scanner;
public class Bronz {
public static void main(String[] args) {
String s;//pon ponm ponma ponmal o/p:pon
int count=0,d,r=0;
char b[]=new char[100];
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++){
 str[i]=in.next();
}
int a[]=new int[str.length];
for(int i=0;i<str.length;i++){
	a[i]=str[i].length();
}
Arrays.sort(a);
int min=a[0];
char ch[]=str[0].toCharArray();
String out="";
for(int i=1;i<str.length;i++){
	for(int j=0;j<min;j++){
	char v=str[i].charAt(j);
	if(ch[i-1]==v){
		out=out+String.valueOf(v);
	}
}
}
System.out.println(out);
}
}
