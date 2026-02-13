class magic{
	public static void main (String [] args){
		int a = 50113;
		int sum=0;
		int res=0;
	for (int i =0;i<a ;i++ ){
		int digits=a%10;
		sum+=digits;
		a=a/10;
		
	}
	while (sum>0){
		int tot=sum%10;
		res+=tot;
		sum=sum/10;
	
	}
	if (res==1)
	{ System.out.println("This is a Magic Number ");
	}
	else{
	System.out.print(res);
	}
		
}
}