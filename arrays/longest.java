class longest {
	public static void main (String [] args ){
		int [] arr = {1,2,1,1,1,3,2,1};
		int k =4;
		int left = 0,max=0,sum=0;
		
		for (int i =0;i<arr.length ;i++ ){
			sum +=arr[i];//12
			while (sum > k ){
				sum-= arr[left];//12-1= 11 , 11-2=9,9-1=8,8-1=7,7-1 = 6,6-3=3
				left++;}//arr[1] = 2, 1,1,1,3
			if (sum == k){
				int len = i - left+1;
				if (len>max){
					max = len;}
			}
		} System.out.println(max);
	}
}