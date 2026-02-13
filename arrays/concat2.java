// return value of array in term of 2n (leetcode)Q1

class concat2{
	public static void main (String [] args){
		int [] a = {1,2,3};
		int [] c= new int [2*a.length];	  //init array length
		
		for (int i =0;i<a.length ;i++ )	//assign values of a to c
		{c[i]=a[i];
		}
		
		for (int i =0;i<a.length ;i++ )	//adding 2n
		{c[a.length+i]=a[i];
		}
		
		for (int i =0;i<c.length ;i++ )	//returning value of c 
		{System.out.println(c[i]);
		}
	}
}