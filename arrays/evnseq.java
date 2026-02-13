class evnseq{
	public static void main (String [] args){
		int a=36158;
		String str=a+"";
		String odd="";
		int count=0;
		for (int i=0;i<str.length();i++ ){
			int num = str.charAt(i)-48;
			if (num%2!=0)
			{
				odd+=num;
				count++;
			}}
			System.out.println(odd+""+count);
	}
}
			
			
		