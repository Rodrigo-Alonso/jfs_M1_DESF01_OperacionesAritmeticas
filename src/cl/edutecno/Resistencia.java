package cl.edutecno;

import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese resistencia 1: ");
		float r1 = sc.nextFloat();
		
		System.out.println("Ingrese resistencia 2: ");
		float r2 = sc.nextFloat();
		
		System.out.println("Ingrese resistencia 3: ");
		float r3 = sc.nextFloat();
		
		float rt = 1/((1/r1)+(1/r2)+(1/r3));
		
		System.out.printf("La resistencia total es de %.1f", rt);
	}

}
