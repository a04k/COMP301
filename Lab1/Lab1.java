/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Lab1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * // Initialize an integer variable
		 * int x = 5;
		 * // Implicit conversion from int to double
		 * double y = x;
		 * // Print the value of y
		 * System.out.println("y= " + y); // Output: y= 5.0
		 * 
		 * // Initialize a double variable
		 * double a = 2.7;
		 * // Explicit casting from double to int
		 * int b = (int) a;
		 * // Print the value of b
		 * System.out.println("b= " + b); // Output: b= 2
		 * 
		 * // Initialize a float variable
		 * float c = 2.7f; // 'f' denotes a float literal
		 * // Implicit conversion from float to double
		 * double d = c;
		 * // Print the value of d
		 * System.out.println("d= " + d); // Output: d= 2.7
		 * 
		 * 
		 * float n1,n2;
		 * System.out.print("enter 1st num");
		 * n1=in.nextFloat();
		 * System.out.print("enter 2end num");
		 * n2=in.nextFloat();
		 * 
		 * double z=n1/n2;
		 * double x=n2%n2;
		 * System.out.print("the sum of n1/n2="+z);
		 * System.out.print("the sum of n1%n2="+x);
		 * 
		 * //fabonachi
		 * int n=in.nextInt();
		 * 
		 * for(int i=0;i<n;i++)
		 * {
		 * System.out.print(fibonacci(i) + " ");
		 * }
		 * int b = in.nextInt();
		 * int e = in.nextInt();
		 * int r = 1;
		 * 
		 * for(int i=1; i<=e; i++){
		 * r *= b;
		 * }
		 * 
		 * System.out.println(r);
		 * 
		 * int n1,n2;
		 * System.out.print("Enter 1st num");
		 * n1=in.nextInt();
		 * System.out.print("Enter end num");
		 * n2=in.nextInt();
		 * 
		 * for( int i=n1;i<=n2;i++)
		 * {
		 * if(isPrime(n1))
		 * {
		 * System.out.print(i );
		 * }
		 * }
		 * 
		 * int n1=in.nextInt();
		 * char e='A';
		 * 
		 * for( int i=0;i<=n1;i++)
		 * {
		 * for( int j=0;j<=i;j++)
		 * {
		 * System.out.print(e);
		 * }
		 * System.out.print("\n");
		 * e++;
		 * }
		 */
		int n1 = in.nextInt();
		int x = 1;
		int e = 1;
		for (int i = 1; i <= n1; i++) {
			for (int c = n1 - 1; c >= i; c--) {
				System.out.print(" ");
			}
			for (int j = 0; j < e; j++) {
				System.out.print(x);
			}
			System.out.print("\n");
			e = e + 2;
			x++;
		}
		in.close();	
	}

	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false; // 0 and 1 are not prime numbers
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false; // n is divisible by i, not prime
			}
		}
		return true; // n is prime
	}

	
}

