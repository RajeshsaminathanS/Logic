package practice;

public class Array {

	
	// SINGLE DIMENSIONAL ARRAY
	
	public static void main(String[] args)
	{
		/*int a[]= {1,4,7,5,9,2,11};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
for(int i:a)
{
	System.out.println(i);
}
	}

}*/
		int a[]=new int[5];
		a[0]=1;
		a[1]=4;
		a[2]=7;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int Rajesh:a)
		{
			System.out.println(Rajesh);
		}
	}
}
