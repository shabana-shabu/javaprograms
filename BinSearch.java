import java.util.*;
public class BinSearch {
public static void main(String[] args) 
{
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=Scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the element");
			arr[i]=Scan.nextInt();
		}
		System.out.println("enter the key to be searched");
		int key=Scan.nextInt();
		int low=0;
		int high=arr.length-1;
		
		while(low<=high)
		{
			int  mid=(low+high)/2;
			if (key==arr[mid])
			{
				System.out.println("key found "+mid);
				System.exit(0);
			}
			else if (key>arr[mid])
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
			System.out.println("key not found");
		}				
}
		