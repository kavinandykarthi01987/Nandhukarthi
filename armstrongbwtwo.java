public class armstrongbwtwo {
   public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	int sum=0,c=0;
	for(int i=n1+1;i<n2;i++){
		int a=i;
		sum=0;
		while(a!=0){
			c=a%10;
			a=a/10;
			c=(int)Math.pow(c,3);
			sum=(sum)+c;
		}
		if(i==sum){
			System.out.println(i);
	      }

	}
   }
}
