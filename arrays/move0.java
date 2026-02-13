import java.util.*;
class move0{
	public static void main (String [] args){
		int [] arr = {1,2,0,3,1,0};
		int pos=0;
		for (int i =0;i<arrk.length ;i++ )
		{ 
			if (arr[i]!=0){
				int temp = arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
				pos++;}}
				
				System.out.print (Arrays.toString(arr));
		
				}
}       