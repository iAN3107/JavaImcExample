package application;

import java.util.Locale;
import java.util.Scanner;

import entities.IMC;


	public class Program {
		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		IMC x;
		x = new IMC();		
		
		System.out.println("CALCULE SEU IMC");
		System.out.print("Digite seu peso:");
		
		x.peso = sc.nextDouble();
		
		System.out.print("Digite sua altura:");
		x.altura = sc.nextDouble();
		
		x.imc();
		
		sc.close();
		}
		
	}