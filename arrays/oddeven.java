class oddeven{
	public static void main (String [] args){
		int a = 361589;
		String str=a+"";
		String odd="";
		String even="";
		for (int i=0;i<str.length() ;i++ ){
			int num =str.charAt(i)-'0';
			if (num%2!=0){
				odd+=num;
							}
			else {
				even+=num;
			}}
	System.out.println(odd+""+even);
	}
}


