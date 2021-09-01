import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int n=Scan.nextInt();
		System.out.println("enter array contents");
		int arr[]=new int[n];
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.println("enter the element");
				arr[i]=Scan.nextInt();
			}
			System.out.println("enter key to be searched");
			int key=Scan.nextInt();
			for(int i=0;i<=arr.length-1;i++)
			{
		if(key==arr[i])
		{
			System.out.println("key found at index  "+i);
			System.exit(0);
		}
			}
			System.out.println("not found");
		}
	}
