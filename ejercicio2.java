package UD6;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main (String []args) {
	
		String cantidadbeta=JOptionPane.showInputDialog("Cuantos numeros quieres?");
		int cantidad=Integer.parseInt(cantidadbeta);
		
		int cantidadnumerosgenerados=0;
		while (cantidadnumerosgenerados!=cantidad) {
		if (cantidadnumerosgenerados!=cantidad) {
			int max = 9999999;
	        int min = 1;
	        int rango = max - min + 1;
			
				int numerox=(int)(Math.random() * rango) + min;
				System.out.println(numerox);
				cantidadnumerosgenerados++;
			}
		else 
			if(cantidadnumerosgenerados==cantidad) {
				System.out.println("Esos son tus numeros");
				
			
		
		}
		}
		
	}
}
