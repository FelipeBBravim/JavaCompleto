package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> alunos = new HashSet<>();
		
		System.out.print("How many courses? ");
		int N = sc.nextInt();
		
		for (int i=1;i<=N;i++) {
			System.out.printf("How many students in course #%d? ", i);
			int A = sc.nextInt();
			
			for (int j=1;j<=A;j++) {
				System.out.printf("Student #%d: ", j);
				alunos.add(sc.nextInt());
			}
		}
		
		System.out.printf("Total students: %d", alunos.size());
		
		
		sc.close();
	}

}
