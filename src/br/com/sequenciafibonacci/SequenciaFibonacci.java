package br.com.sequenciafibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        Integer num1 = 1, num2 = 0;
        List<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        
		System.out.print("Digite um numero: ");
		Integer valorEntrada = teclado.nextInt();
        		
		do{
            num1 = num1 + num2;
            num2 = num1 - num2;
            listFibonacci.add(num2);
		}while(num2 <= valorEntrada);
        
        System.out.println("\nSequência Fibonacci: " + listFibonacci + "\n");
		
        if(listFibonacci.contains(valorEntrada)) {
        	System.out.println("Seu numero está na sequência.");
        }else {
        	System.out.println("Seu numero não está na sequência.");
        }
	}
}
