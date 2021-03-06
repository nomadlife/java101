package first.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class JavaIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Buffered Reader 
		System.out.println("==Test1. Buffered Reader");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Type your name:");
		String name = in.readLine();
		System.out.println("Your name is:"+name);
		System.out.print("Type your height:");
		int height = Integer.parseInt(in.readLine());
		System.out.println("Your height is :"+ height);
		
		
		//Wrapper Classes
		//wrapper classes are used when something is typed that is not a String.
		//Every primitive type gas hos own Wrapper class.
		// int -> Integer
		// long -> Long
		// boolean -> Boolean
		System.out.println("==Test2. Wrapper Classes");
		int i= Integer.parseInt("10");
		long l= Long.parseLong("10");
		
		// Scanner
		//Alternative for this is class Scanner, which can read both primitive types and Strings.
		//Scanner is using delimiter to break input into token. Delimiter is whitespace by default.
		System.out.println("==Test3. Scanner");
		String yourName;
		int yourHeight;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name:");
		yourName = sc.nextLine();
		System.out.println("Your name is "+yourName);
		
		System.out.println("Enter your height:");
		yourHeight = sc.nextInt();
		System.out.println("Your height is "+yourHeight);
		
		sc.close();
		
		
	}

}
