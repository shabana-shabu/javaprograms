import java.util.Scanner;
public class Pattern{
	public static void main(String[] args) {
		int n,i,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter val of n");
		n = scan.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}