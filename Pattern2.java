import java.util.*;
public class Pattern2{
	public static void main(String[] args) {
		int n,i,j,m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter val of n");
		n = scan.nextInt();
		
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<2*n;j++)
			{
				if(i==n|| j==n-i+1|| j-i==n-1 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


}