	import java.util.*;
	public class ConcatArray {
		public static void main(String[] args) {
			int a[] = new int[] {11,22,44,55};
			int b[] = new int[] {1,2,3};
			int c[]= new int[a.length+b.length];		
			int n1,n2,n;
			n1= a.length;
			n2=b.length;
			n = n1+n2;
			for(int i=0;i<n;i++)
			{
				if(i<n1)			 
					c[i]=a[i];
				else
					c[i]=b[i-n1];
			}
			displayarray(c);
		}
		static void inputarray(int a[])
		{
			Scanner ob = new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				System.out.println("enter the elements = ");
				a[i]=ob.nextInt();
			}
		}
		static void displayarray(int a[])
		{
			System.out.println("the array elements ");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
	}
