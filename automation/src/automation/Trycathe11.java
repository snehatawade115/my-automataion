package automation;

import java.util.Scanner;

public class Trycathe11 {
	public static void main(String[] args) {
		try {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("enter first no.");
				int a=scan.nextInt();
				System.out.println("enetr second no");
				int b=scan.nextInt();
				
				try { int c=a/b;
				System.out.println(c);
				System.out.println("thans for using division calculator");
				}
				catch(Exception e) {
					System.out.println("invalid input:" +e);
				}
			}}
			catch(Exception e) {
				System.out.println(e);
			}
			finally {
				System.out.println("the program is written bt PCK");
		
			
			}
			
			
			
		}
	}


