	import java.util.Scanner;
	public class FindMin {
		static int minimumarray(int a[])
		{
			int min=a[0],i,minindex=0;
			for(i=1;i<a.length;i++)
			{
				if(min>a[i])
				{
					min = a[i];
					minindex = i;
				}
			}
			return minindex;
		}
		static int maximumarray(int a[])
		{
			int max=a[0],i,maxindex=0;
			for(i=1;i<a.length;i++)
			{
				if(max<a[i])
				{
					max = a[i];
					maxindex = i;
				}
			}
			return maxindex;
		}
		public static void main(String[] args) {
			Scanner ob = new Scanner(System.in);
			int n;
			System.out.println("Enter the no of elements= ");
			n = ob.nextInt();
			int a[] = new int[n];
			inputarray(a);	
			displayarray(a);
			int ind = minimumarray(a);
			System.out.println("minimum element= "+ a[ind] );

		}
		static void inputarray(int a[])
		{
			Scanner ob = new Scanner(System.in);
			for(int i=0;i<a.length;i++)
			{
				System.out.println("enter the elements ");
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

