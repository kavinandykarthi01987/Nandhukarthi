public class maxarrayelement {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++){
    	 a[i]=s.nextInt();
     }
     Arrays.sort(a);
     System.out.println(a[0]);
	}
}
