class occ {
	public static void main (String [] agrs ){
		int [] arr = {4,2,91,4,3,69,69,4,35};
		int n = arr.length;
		int freq []= new int [256];
		
		for (int i=0;i<arr.length ;i++ ){
			int ch = arr[i];
			freq[ch]++;
		}
		for(int i =0;i<256;i++){
		 if (freq[i]>0){
			 System.out.println(i+"="+freq[i]);
		 if (freq[i]==1){
			 System.out.println("unique"+i+"="+freq[i]);}
			else {
				 System.out.println("duplicates"+i+"="+freq[i]);}
		 }
		 }
	}
}
