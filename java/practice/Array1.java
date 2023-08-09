
// MULTIDIMENSION ARRAY

package practice;

public class Array1 {
	public static void main(String[] args) {
		//int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int a[][]=new int[3][3];
		a[0][0]=1;
		a[0][1]=4;
		a[1][0]=8;
		a[2][0]=9;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
		}
		
		
	}

}
