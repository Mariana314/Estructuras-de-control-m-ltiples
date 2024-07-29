package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		 char grado = 'B';

	        switch (grado) {
	            case 'A':
	                System.out.println("Excelente");
	                break;
	            case 'B':
	                System.out.println("Bueno");
	                break;
	            case 'C':
	                System.out.println("Regular");
	                break;
	            case 'D':
	                System.out.println("Deficiente");
	                break;
	            case 'F':
	                System.out.println("Reprobado");
	                break;
	            default:
	                System.out.println("Nota inválida");
	                break;

	        }
	}

}
