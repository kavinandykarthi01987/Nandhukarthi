public class time {
  public static void main(String[] args) {
		String a="10:50";
		String b="9:20";
		String str1[]=a.split(":");
		String str2[]=b.split(":");
		int t1=Integer.valueOf(str1[0]);
		int t2=Integer.valueOf(str2[0]);
		int m1=Integer.valueOf(str1[1]);
		int m2=Integer.valueOf(str2[1]);
		System.out.println(Math.abs(t1-t2)+" "+Math.abs(m1-m2));
	}

}
