package week1;

import java.util.Scanner;

public class Programmers_���簢�������_kmj {

	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int n = in.nextInt();
				int m = in.nextInt();
				
				for(int i = 0; i < m; i++) {
					for(int j = 0; j < n; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}


	}