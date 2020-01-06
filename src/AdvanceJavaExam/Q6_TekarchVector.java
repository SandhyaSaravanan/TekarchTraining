package AdvanceJavaExam;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Q6_TekarchVector {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		Vector v = new Vector();
		v.add('t');
		v.add('e');
		v.add('k');
		v.add('a');
		v.add('r');
		v.add('c');
		v.add('h');
					
		for(int i=3;i<n+3;i++) { v.add(i,'Z' );	}
		System.out.println();
		System.out.println("After adding "+ n +" Zs from 3rd position");
		
		printVector(v);
				
		for(int i=0;i<n;i++)
		{				
			v.remove(6);
		}
		System.out.println();
		System.out.println("After removing "+ n + " characters from 6th position");
		printVector(v);
				
	}
	public static void printVector(Vector vec)
	{
		Enumeration en = vec.elements();
		System.out.println();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement());
		}
	}
}
