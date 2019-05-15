package com.br.ola.mundo;
import java.util.Scanner;  // importando o scanner
public class Controle {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner entrada = new Scanner(System.in); 
			 
			System.out.println("Qual o valor máximo de produtos no estoque?");
			int max = entrada.nextInt();
			
			System.out.println("Qual o valor minimo de produtos no estoque?");
			int min = entrada.nextInt();
			
			
			 double media = (max + min) / entrada.nextInt();
			  System.out.println("A média de produtos no estoque é: " + media);
	
		}
	
	}
