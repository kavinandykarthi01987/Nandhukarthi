public class guvi {
	public static void main(String[] args) {
		String s="fghn1243";
		s=s.replaceAll("[0-9]", "");
		System.out.println(s);
		int l=s.length();
		if(l==0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}
}
