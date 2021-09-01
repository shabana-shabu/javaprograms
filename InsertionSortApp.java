import java.util.*;
class Insertion{
	void InsertionSort(int a[]){
		int item;
		int j;
		for(int i=0;i<=a.length-1;i++)
		{
			item=a[i];
			j=i-1;
			while(j>=0&&a[j]>item)
			{
				a[j+1]=a[j];
				j--;
			}
		a[j+1]=item;
		}
	}
}	
class InsertionSortApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length"); 
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array contents");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("before sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		Insertion In=new Insertion();
		In.InsertionSort(arr);
		System.out.println("after Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
}
}
