import java.util.*;
class Sorting{
	void BubbleSort(int a[])
	{
		int temp;
		for(int i=0;i<=a.length-2;i++)
		{
			for(int j=0;j<=a.length-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
			}
			}
	}
	
}
public class BubbleSortApp{
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the length of array");
		int n=Scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=Scan.nextInt();
		}
		System.out.println("before sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
			Sorting s=new Sorting();
			s.BubbleSort(arr);
System.out.println("After Sorting: ");
for(int i =0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
			
		}

	}
}
