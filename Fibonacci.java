import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) 
	{
		 int maxNumber = 0; 
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
		    System.out.println("How many numbers you want in Fibonacci:");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
 
	        for (int i = 1; i <= maxNumber; ++i)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
	}
 
}
