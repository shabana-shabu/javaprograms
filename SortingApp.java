import java.util.*;
class Sorting{
	void SelectionSort(int a[]){
		int min;
		int temp;
		int pos;
		for(int i=0;i<=a.length-2;i++)
		{
			min=a[i];
			pos=i;
	 for(int j=i+1;j<=a.length-1;j++)
		if(a[j]<min)
		 {
		 min=a[j];
		 pos=j; 
	 }
		temp=a[i];
		a[i]=a[pos];
		a[pos]=temp;
	}
}
}
public class SortingApp{
	public static void main(String[]args){
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
		Sorting S =new Sorting();
		S.SelectionSort(arr);
		System.out.println("after Sorting");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	 
}
